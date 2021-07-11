import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }
    
    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition >= 0) {
            this.myContacts.remove(foundPosition);
            System.out.println(contact.getName() + ", was deleted.");
            
            return true;
        } else {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
    }
    
    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean found = true;
        int foundPosition = findContact(oldContact);
        
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            found = false;
            
            return found;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                " already exists.");
            found = false;
            
            return found;
        }
        
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        
        return found;
    }
    
    public Contact queryContact(String contactName) {
        int position = findContact(contactName);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }
    
    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " 
                + this.myContacts.get(i).getName() + " -> " 
                + this.myContacts.get(i).getPhoneNumber());
        }
    }
}