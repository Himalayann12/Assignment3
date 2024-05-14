package Assignment3;

class AddDistance {
    int feet, inches;
    AddDistance(int f, int i) { feet = f; inches = i; }
    AddDistance add(AddDistance o) {
        int t = feet * 12 + inches + o.feet * 12 + o.inches;
        return new AddDistance(t / 12, t % 12);
    }
    void display() { System.out.println(feet + " feet " + inches + " inches"); }
    
    public static void main(String[] args) {
        AddDistance d1 = new AddDistance(2, 6), 
        d2 = new AddDistance(1, 9);
        AddDistance total = d1.add(d2);
        total.display(); 
    }
}
