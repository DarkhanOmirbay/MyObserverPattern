package ObserverPattern;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite=new JavaDeveloperJobSite();
        javaDeveloperJobSite.addVacancy("First java position");
        javaDeveloperJobSite.addVacancy(("Second java position"));
        Observer firstSubscriber = new Subscriber("Darkhan Omirbay");
        Observer secondSubscriber = new Subscriber("Daryn Omirbay");
        javaDeveloperJobSite.addObserver(firstSubscriber);
        javaDeveloperJobSite.addObserver(secondSubscriber);
        javaDeveloperJobSite.addVacancy("Third java position");
        javaDeveloperJobSite.removeVacancy("First java position");
    }
}
