package sarasai;

public class MyList {
    
    private Object[] list;
    
    public MyList() {
        this.list = new Object[0];
    }

    public void add(Object o) {
//        System.out.println("Pridedam: " + o);
        // sukuriam nauja masyva, vienu elementu didesni negu buvo
        Object[] newList = new Object[this.list.length + 1];
        
        // nukopijuojam is seno masvyo visas esamas reiksmes
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        
        // i paskutine (nauja) vieta irasom nuoroda i prideta objekta
        newList[newList.length - 1] = o;
        
        // nuo siol naudosimes ilgesniu masyvu
        this.list = newList;
    }

    public void remove(int index) {
//        System.out.println("Isimam index: " + index);
        // jei index < 0 arba didesnis arba lygus uz esama saraso ilgi - nedaro nieko
        if(index >= 0 && index < list.length){
            // sukuriam nauja masyva, vienu elementu mazesni negu buvo
            Object[] newList = new Object[this.list.length - 1];
            int a = 0;
            // einam per sena masyva, kopijuodami reiksmes
            for(int i = 0; i < this.list.length; i++) {
                if(i != index){
                    newList[a] = this.list[i];
                    a++;
                }
            }
            // nuo siol naudosimes ilgesniu masyvu
            this.list = newList;
        } 
    }

    public Object get(int index) {
        // cia dar reikia pataisyt
        if(index >= 0 && index < list.length){
            return this.list[index];
        } else {
            return null;
        }
    }

    public void set(int index, Object o) {
        if(index >= 0 && index < list.length){
            this.list[index] = o;
        }
    }

    public void insert(int index, Object o) {
        // jei index < 0 arba didesnis arba lygus uz esama saraso ilgi - nedaro nieko
        
        if(index >= 0 && index <= list.length){
            
            // sukuriam nauja masyva, vienu elementu didesni negu buvo
            Object[] newList = new Object[this.list.length + 1];
            int listIndex = 0;

            // kopijuojam reiksmes ir idedam nauja
            for (int i = 0; i < newList.length; i++) {
                if(i == index){
                    newList[i] = o;
                } else {
                    newList[i] = this.list[listIndex];
                    listIndex++;
                }
            }
            
            // nuo siol naudosimes ilgesniu masyvu
            this.list = newList;
        }
    }

    public int size() {
        return this.list.length;
    }

    public String toString() {
        String s = "{";
         for(int i = 0; i < this.list.length; i++) {
             if(i == this.list.length -1){
                 s += " " + this.list[i];
             } else {
                 s += " " + this.list[i]+ ",";
             }
            }
        // turi grazinti tikra reiksme
        // kolkas grazinam ""
        return (s + " }");
    }

}
