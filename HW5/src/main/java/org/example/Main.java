package org.example;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import freemarker.template.TemplateException;

//C:\\Users\\rokuf\\Desktop\\Robert.txt
/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws InvalidDataException     the invalid data exception
     * @throws CommandNotFoundException the command not found exception
     * @throws IOException              the io exception
     * @throws TemplateException        the template exception
     */
    public static void main(String[] args) throws InvalidDataException, CommandNotFoundException, IOException, TemplateException {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();
        CatalogManager catalogManager = new CatalogManager();

         //Generate an HTML report of the catalog and open it in the default browser

        while (true) {
            try {
                System.out.println("Enter command (load, add, list, view, report, exit):");
                String command = scanner.nextLine();
                switch (command) {
                    case "load":
                        System.out.println("Enter file name:");
                        String fileName = scanner.nextLine();
                        catalogManager.loadCatalog(fileName);
                        break;
                    case "add":
                        System.out.println("Enter document id:");
                        String id = scanner.nextLine();
                        System.out.println("Enter document name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter document location:");
                        String location = scanner.nextLine();
                        Map<String, String> tags = new HashMap<>();
                        while (true) {
                            System.out.println("Enter tag name (or exit to stop adding tags):");
                            String tagName = scanner.nextLine();
                            if (tagName.equals("exit")) {
                                break;
                            }
                            System.out.println("Enter tag value:");
                            String tagValue = scanner.nextLine();
                            tags.put(tagName, tagValue);
                        }
                        AddCommand addCommand = new AddCommand(catalog,new  Document( id,  name,  location, tags));
                        addCommand.execute();
                        break;
                    case "list":
                        ListCommand listCommand = new ListCommand(catalog);
                        listCommand.execute();
                        break;
                    case "view":

                        System.out.println("Enter document location:");
                        String documentName = scanner.nextLine();
                        ViewCommand viewCommand = new ViewCommand(documentName);
                        viewCommand.execute();
                        break;
                    case "report":
                        System.out.println("Enter output file name:");
                        String outputFile = scanner.nextLine();
                        ReportCommand reportCommand =new ReportCommand(catalog);
                        reportCommand.execute();
                        break;
                    case "exit":
                        System.exit(0);
                    default:
                        throw new CommandNotFoundException("Invalid command!");
                }
            } catch (IOException | TemplateException | CommandNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InvalidDataException e) {
                throw new RuntimeException(e);
            }
        }
    }
}