package org.example;

/**
 * The type List command.
 */
public class ListCommand implements Command {
    private final Catalog catalog;

    /**
     * Instantiates a new List command.
     *
     * @param catalog the catalog
     */
    public ListCommand(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        catalog.getDocuments().forEach((document -> System.out.println(document.getId()+document.getName()+ document.getLocation() + document.getTags())));
    }
}