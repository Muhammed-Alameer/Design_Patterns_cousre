import java.util.ArrayList;
import java.util.Iterator;
  
// Implemented by Cricket data to communicate
// with observers
interface Subject
{
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObservers();
}