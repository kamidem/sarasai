package sarasai;

public class MyList {
    
    private Object[] list;
    
    public MyList() {
        this.list = new Object[0];
    }

    public void add(Object o) {

        Object[] newList = new Object[this.list.length + 1];
        
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        
        newList[newList.length - 1] = o;
        
        this.list = newList;
    }

    public void remove(int index) {
        if(index >= 0 && index < list.length){
            Object[] newList = new Object[this.list.length - 1];
            int a = 0;
            for(int i = 0; i < this.list.length; i++) {
                if(i != index){
                    newList[a] = this.list[i];
                    a++;
                }
            }
            this.list = newList;
        } else {
            try {
                throw new Klaida("Indexas yra netinkamas skaicius: " + index);
            }
            catch(Klaida k){
                System.out.println("*** Pagavau klaida: " + k.getMessage());
//                k.printStackTrace();
            }
        }
    }

    public Object get(int index) {
        if(index >= 0 && index < list.length){
            return this.list[index];
        } else {
            try {
                throw new Klaida("Indexas yra netinkamas skaicius: " + index);
            }
            catch(Klaida k){
                System.out.println("*** Pagavau klaida: " + k.getMessage());
//                k.printStackTrace();
            }
            return null;
        }
    }

    public void set(int index, Object o) {
        if(index >= 0 && index < list.length){
            this.list[index] = o;
        }
    }

    public void insert(int index, Object o) {
        
        if(index >= 0 && index <= list.length){
            
            Object[] newList = new Object[this.list.length + 1];
            int listIndex = 0;

            for (int i = 0; i < newList.length; i++) {
                if(i == index){
                    newList[i] = o;
                } else {
                    newList[i] = this.list[listIndex];
                    listIndex++;
                }
            }
            
            this.list = newList;
        } else {
            try {
                throw new Klaida("Indexas yra netinkamas skaicius: " + index);
            }
            catch(Klaida k){
                System.out.println("*** Pagavau klaida: " + k.getMessage());
//                k.printStackTrace();
            }
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
        return (s + " }");
    }

}

// destytojo
//
//package sarasai;
// 
//public class MyList {
//
//    private Object[] list;
//
//    public MyList() {
//        this.list = new Object[0];
//    }
// 
//    public void add(Object o) {
//        // sukuriam nauja masyva, vienu elementu didesni negu buvo
//        Object[] newList = new Object[this.list.length + 1];
//
//        // nukopijuojam is seno masvyo visas esamas reiksmes
//        for (int i = 0; i < this.list.length; i++) {
//            newList[i] = this.list[i];
//        }
//
//        // i paskutine (nauja) vieta irasom nuoroda i prideta objekta
//        newList[newList.length - 1] = o;
//
//        // nuo siol naudosimes ilgesniu masyvu
//        this.list = newList;
//    }
// 
//    public void remove(int index) {
//        if (index < 0 || index >= this.list.length) {
//            return;
//        }
//        Object[] newList = new Object[this.list.length - 1];
//
//        for (int i = 0, j = 0; i < this.list.length; i++) {
//            if (i != index) {
//                newList[j++] = this.list[i];
//            }
//        }
//
//        this.list = newList;
//    }
// 
//    public Object get(int index) {
//        if (index < 0 || index >= this.list.length) {
//            return null;
//        }
//        return this.list[index];
//    }
// 
//    public void set(int index, Object o) {
//        if (index < 0 || index >= this.list.length) {
//            return;
//        }
//        this.list[index] = o;
//    }
// 
//    public void insert(int index, Object o) {
//        if (index < 0 || index >= this.list.length) {
//            return;
//        }
//        Object[] newList = new Object[this.list.length + 1];
//
//        for (int i = 0, j = 0; i < newList.length; i++) {
//            if (i == index) {
//                newList[i] = o;
//            } else {
//                newList[i] = this.list[j++];
//            }
//        }
//
//        this.list = newList;
// 
//    }
// 
//    public int size() {
//        return this.list.length;
//    }
// 
//    public String toString() {
//        String ret = "{";
//        for (int i = 0; i < this.list.length; i++) {
//            if (i > 0) {
//                ret += ", ";
//            }
//            ret += this.list[i];
//        }
//        ret += "}";
//        return ret;
//    }
// 
//}