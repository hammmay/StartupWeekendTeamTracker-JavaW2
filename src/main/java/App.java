//front-end user interface routes
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("team", request.session().attribute("team"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Team> teams = request.session().attribute("teams");
if (teams == null) {
        teams = new ArrayList<Team>();
        request.session().attribute("teams", teams);
      }

      String teamDescription = request.queryParams("teamDescription");
      Team newTeam = new Team(teamDescription);
      teams.add(newTeam);

      model.put("template", "templates/TeamSuccess.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());




  }
}
