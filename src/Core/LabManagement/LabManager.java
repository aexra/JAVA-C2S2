package Core.LabManagement;

import java.util.Dictionary;
import java.util.Hashtable;

import Core.ClassManagement.ClassAccessor;

import static Helpers.Logger.*;

public class LabManager {
    private static LabManager INSTANCE = null;
    private static final String labsPackageName = "Labs";
    private static Dictionary<Integer, Class<?>> labs = new Hashtable<>();

    private LabManager() throws Exception {    
        INSTANCE = this;
        init();
    }
    private final void init() throws Exception {
        ClassAccessor.getClassesFromPackage(labsPackageName).forEach(cls -> {
            labs.put(Integer.parseInt(cls.getName().replace("Labs.Lab", "")), cls);
        });
    }

    public final static LabManager getInstance() throws Exception {
        return INSTANCE != null? INSTANCE : new LabManager();
    }

    public final void run(int ilab) throws Exception {
        _run(ilab, 0, null);
    }
    public final void run(int ilab, String[] args) throws Exception {
        _run(ilab, 0, args);
    }
    public final void run(int ilab, int itask) throws Exception {
        _run(ilab, itask, null);
    }
    public final void run(int ilab, int itask, String[] args) throws Exception {
        _run(ilab, itask, args);
    }

    private final void _run(int ilab, int itask, String[] args) throws Exception {

        // Создает экземпляр лабы если она существует, иначе конец
        Lab lab;
        try {
            lab = (Lab)labs.get(ilab).getDeclaredConstructor().newInstance();
        }
        catch (Exception ex) {
            error("Не найдено лабы с индексом " + Integer.toString(ilab));
            return;
        }

        // Если номер задания 0, то нужно вызвать все задачи лабы
        if (itask == 0) {
            lab.run(args);
            return;
        }

        // Иначе вызвать конкретную
        lab.run(itask, args);
    }
}
