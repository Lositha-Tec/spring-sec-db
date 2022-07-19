package lk.tea_leaves_collector.util.aspect;


import lk.tea_leaves_collector.util.service.MobileMessageService;
import lombok.AllArgsConstructor;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@AllArgsConstructor
public class NewTurnAspects {

  private final MobileMessageService mobileMessageService;

//
//  @After( value =
//      "execution(* lk.tea_leaves_collector.asset.person.controller.PersonController.savePersonTurn(..))" )
//  public void saveAndTurn() {
//    messageSend();
//  }
//
//  private void messageSend() {
//    PersonLocationInteractTime personLocationInteractTime = personLocationInteractTimeService.findLastOne();
//    System.out.println(personLocationInteractTime.getId());
//    HashSet< News > newsServiceHashSet = new HashSet<>();
//    HashSet< LocationInteract > locationInteractHashSet = new HashSet<>();
//
//    Turn turn = turnService.findById(personLocationInteractTime.getTurn().getId());
//
//    if ( turn != null ) {
//      for ( PersonLocationInteractTime locationInteractTime : personLocationInteractTimeService.findByTurn(turn) ) {
//        locationInteractHashSet.add(locationInteractTime.getLocationInteract());
//      }
//      for ( LocationInteract locationInteract : locationInteractHashSet ) {
//        GramaNiladhari gramaNiladhari = locationInteractService.findById(locationInteract.getId())
//        .getGramaNiladhari();
//        newsServiceHashSet.addAll(newsService.findByGramaNiladhari(gramaNiladhari));
//      }
//
//      String locationListUrl = MvcUriComponentsBuilder
//          .fromMethodName(PersonLocationInteractTimeController.class, "interactLocationSearchPage", "")
//          .toUriString();
//
//      newsServiceHashSet.forEach(x -> {
//        String mobile = "+94" + x.getMobile().substring(1, 10);
//        try {
//          String unsubscribeUrl = MvcUriComponentsBuilder
//              .fromMethodName(NewsController.class, "unSubscribe", x.getMobile())
//              .toUriString();
//          String message = "Please check new updated location list \n" + locationListUrl + "\n if you want to " +
//              "unsubscribe click here " + unsubscribeUrl;
//
//          mobileMessageService.sendSMS(mobile, message);
//          System.out.println("send message");
//        } catch ( Exception e ) {
//          e.printStackTrace();
//        }
//      });
//    }
//  }
//
//  @After( value =
//      "execution(* lk.tea_leaves_collector.asset.turn.controller.TurnController.persist(..))" )
//  public void turn() {
//    messageSend();
//  }
}