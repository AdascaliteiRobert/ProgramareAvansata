package org.example;

/**
 * The type Add command.
 */
public class AddCommand implements Command {
    private Catalog catalog;
    private Document document;

    /**
     * Instantiates a new Add command.
     *
     * @param catalog  the catalog
     * @param document the document
     */
    public AddCommand(Catalog catalog, Document document) {
        this.catalog=catalog;
        this.document=document;

    }
    @Override
    public void execute()
    {
        catalog.getDocuments().add(document);
    }

}




