package plasma.service.meta;

import plasma.model.Settings;

import java.util.List;

public interface SettingsMeta {
    List<Settings> findAll();
    Settings save(Settings setting);
    Settings findById(Long id);
    void deleteById(Long id);
    void update(Long id, Settings setting);
}
