package Core.LabManagement;

import static Helpers.Logger.*;

import java.util.Arrays;
import java.util.TreeMap;

import Core.Interfaces.ILabTask;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Lab {
    protected TreeMap<Integer, Method> tasks = new TreeMap<>();

    public Lab() {
        init();
    }
    private final void init() {
        fillTasksArray();
    }
    private final void fillTasksArray() {
        for (Method m : this.getClass().getDeclaredMethods()) {
            if (m.getName().charAt(0) == 't') {
                int a;
                try {
                    a = Integer.parseUnsignedInt(m.getName().substring(1)); 
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                tasks.put(a, m);
            }
        }
    }

    public final void run() {
        _run(0, null);
    }
    public final void run(String[] args) {
        _run(0, args);
    }
    public final void run(int itask) {
        _run(itask, null);
    }
    public final void run(int itask, String[] args) {
        _run(itask, args);
    }

    private final void _run(int itask, String[] args) {
        if (itask == 0) {
            int argsCounter = 0;
            for (var k : tasks.keySet()) {
                int argsUsed = tasks.get(k).getParameterCount();
                _invokeTask(k, Arrays.copyOfRange(args, argsCounter, argsCounter + argsUsed));
                argsCounter += argsUsed;
            }
        } else {
            _invokeTask(itask, args);
        }
    }
    private final void _invokeTask(int itask, String[] args) {
        // Получает конструктор метода если он существует, иначе конец
        Method m;
        try {
            m = tasks.get(itask);
        }
        catch (Exception ex) {
            error("Задание <" + itask + "> не существует");
            return;
        }

        // Вывод сообщения [INFO   ] Задание №... и описания задания если таковое есть
        log("Задание №" + m.getName().substring(1), "[INF\t] ");
        log("Описание: " + m.getAnnotation(ILabTask.class).description() + "\n", "[INF\t] ");

        // Вызов метода задания
        try {
            if (m.getParameterCount() == 0) m.invoke(this);
            else {
                m.invoke(this, (Object[])args);
            }
        }
        catch (Exception ex) {
            error("Метод задания <" + itask + "> не может быть вызван");
            if (ex instanceof InvocationTargetException) {
                error(((InvocationTargetException)ex).getTargetException().getMessage());
            } else {
                error(ex);
            }
        }

        // Вывод пустой строки между заданиями
        log("\n\n", "");
    }
}
