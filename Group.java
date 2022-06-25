import javax.swing.*;
public class Group
{
    public static void main(String [] abc)
    {
        JFrame bruno = new JFrame("CALCULATOR GUI");
        JTextField nomano= new JTextField();
        JButton q = new JButton("C");
        JButton  w = new JButton("0");
        JButton  e= new JButton("1");
        JButton r = new JButton("2");
        JButton t = new JButton("3");
        JButton y = new JButton("4");
        JButton u = new JButton("5");
        JButton i = new JButton("6");
        JButton o = new JButton("7");
        JButton p = new JButton("8");
        JButton a = new JButton("9");
        JButton s = new JButton("*");
        JButton d = new JButton("/");
        JButton f = new JButton("+");
        JButton g = new JButton("-");
        JButton vv= new JButton("%");
        JButton v1= new JButton("<");
        JButton v2= new JButton(">");
        JButton v3= new JButton("^");
        JButton v4= new JButton("");
        bruno.add(nomano);
        bruno.add(q);
        bruno.add(w);
        bruno.add(e);
        bruno.add(r);
        bruno.add(t);
        bruno.add(y);
        bruno.add(u);
        bruno.add(i);
        bruno.add(o);
        bruno.add(p);
        bruno.add(a);
        bruno.add(s);
        bruno.add(d);
        bruno.add(f);
        bruno.add(g);
        bruno.add(vv);
        bruno.add(v1);
        bruno.add(v2);
        bruno.add(v3);
        bruno.add(v4);
        nomano.setBounds(5,5,310,40);
        q.setBounds(320,5,50,40);
        w.setBounds(5,50,50,50);
        e.setBounds(70,50,50,50);
        r.setBounds(140,50,50,50);
        t.setBounds(200,50,50,50);
        y.setBounds(260,50,50,50);
        u.setBounds(320,50,50,50);
        i.setBounds(5,130,50,50);
        o.setBounds(70,130,50,50);
        p.setBounds(140,130,50,50);
        a.setBounds(200,130,50,50);
        s.setBounds(260,130,50,50);
        d.setBounds(320,130,50,50);
        f.setBounds(5,200,50,50);
        g.setBounds(70,200,50,50);
        vv.setBounds(140,200,50,50);
        v1.setBounds(200,200,50,50);
        v2.setBounds(260,200,50,50);
       v3.setBounds(320,200,50,50);
        bruno.setSize(400,320);
        bruno.setVisible(true);
        bruno.setLayout(null);
        bruno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//GROUP MEMBERS ITS 1
// BRUNO BONIFACE KAFYULILO
// KARIMU NOMANO
// ENOCK MKUMBWA