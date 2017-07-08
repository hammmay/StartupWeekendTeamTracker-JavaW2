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
      model.put("teams", request.session().attribute("teams"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teamSuccessPage", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Team> teams = request.session().attribute("teams");
      if (teams == null) {
        teams = new ArrayList<Team>();
        request.session().attribute("teams", teams);
      }

      String teamDescription = request.queryParams("teamDescription");
      Team newTeam = new Team(teamDescription);
      teams.add(newTeam);

      model.put("template", "templates/teamSuccess.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/eventDetails", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/eventDetailsTemplate.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Team team = Team.find(Integer.parseInt(request.params(":id")));
      model.put("team", team);
      model.put("members", team.getMembers());
      model.put("template", "templates/membersOnTeam.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/memberSuccessPage", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Team team = Team.find(Integer.parseInt(request.queryParams("teamId")));

      String memberDescription = request.queryParams("memberDescription");
      Member newMember = new Member(memberDescription);
      team.addMember(newMember);

      model.put("template", "templates/memberSuccess.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());




  }
}
