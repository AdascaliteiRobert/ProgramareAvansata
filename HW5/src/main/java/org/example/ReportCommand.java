
package org.example;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * The type Report command.
 */
public class ReportCommand implements Command {
    private Catalog catalog;
    private Configuration cfg;

    /**
     * Instantiates a new Report command.
     *
     * @param catalog the catalog
     */
    public ReportCommand(Catalog catalog) {
        this.catalog = catalog;
        cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setClassLoaderForTemplateLoading(getClass().getClassLoader(), "/templates/");
    }

    @Override
    public void execute() throws InvalidDataException, CommandNotFoundException, IOException, TemplateException {
        Template template = cfg.getTemplate("report.ftl");
        Map<String, Object> data = new HashMap<>();
        data.put("documents", catalog.documents);
        Writer out = new FileWriter(new File("report.html"));
        template.process(data, out);
    }
}