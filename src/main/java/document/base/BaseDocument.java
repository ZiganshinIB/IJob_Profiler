package document.base;

public interface BaseDocument {
    void save(WorkDocument wd, String path, String name);
    WorkDocument load(String path, String name);
}
