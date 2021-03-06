package sample.javaee.scopeapp.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@ManagedBean(name = "viewScopedCounterBean")
@ViewScoped
public class ViewScopedCounterBean {

    public ViewScopedCounterBean() {    }
    
    private int count;

    @PostConstruct
    public void init(){
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void countUp(){
        count++;
    }
    
}
