package ro.cts.prototype.model;

public class Client implements AbstractPrototype{

    private String name;
    private String phoneNo;
    private String email;

    private Client()
    {

    }
    @Override
    public AbstractPrototype createCopy() throws CloneNotSupportedException {
        return (AbstractPrototype) this.clone();
    }

    public AbstractPrototype createDeepCopy()
    {
        Client client=new Client();
        client.name=this.name;
        client.phoneNo=this.phoneNo;
        client.email=this.email;
        return (AbstractPrototype) client;
    }

    public Client(String name, String phoneNo, String email) {
        if(name.length()>=3)
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException();
        }
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("name='").append(name).append('\'');
        sb.append(", phoneNo='").append(phoneNo).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
