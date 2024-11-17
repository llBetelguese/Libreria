package model;

import java.util.ArrayList;
import java.util.List;

public record LibroDTO(
        List<AutorDTO> authors,
        String title,
        ArrayList<String> languages,
        int download_count
) {
    @Override
    public List<AutorDTO> authors() {
        return authors;
    }

    @Override
    public String title() {
        return title;
    }

    @Override
    public ArrayList<String> languages() {
        return languages;
    }

    @Override
    public int download_count() {
        return download_count;
    }
}
