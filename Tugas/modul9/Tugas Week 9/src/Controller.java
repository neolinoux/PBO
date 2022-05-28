
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tyo
 */
public class Controller {
    private Model model;
    private View view;
    ArrayList<String> emsg = new ArrayList();
    ArrayList<Model> list_model = new ArrayList();
    
    public Controller(Model m, View v){
        model = m;
        view = v;
        initView(); 
    }
    
    public void initView(){
        view.getNimTextField().setText(model.getNim());
        view.getNamaDepanTextField().setText(model.getNamaDepan());
        view.getNamaBelakangTextField().setText(model.getNamaBelakang());
        view.getUmurTextField().setText(model.getUmur());
        view.getAsalComboBox().setSelectedItem(model.getAsal());
    }
    
    public void initController(){
        view.getSimpanButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanActionPerformed(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        view.getResetButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
    
    public void simpanActionPerformed(ActionEvent e){
        validate();
        if(emsg.isEmpty()){
            model.setNamaDepan(namaDepan);
        }
    }
    
    public void validate(){
        if (model.getNamaDepan() == null) {
            emsg.add("Invalid input in Nama");
        }
        
        if(model.getNamaBelakang() == null){
            emsg.add("Invalid input in Nama");
        }
        
        if(model.getNim().length() != 6 || model.getNim() == null){
            emsg.add("Invalid input in NIM (must be 6 digits)");
        }
        
        if((model.getNamaDepan().length() + model.getNamaBelakang().length()) >= 50){
            emsg.add("Invalid input in Nama (maximal 50 characters)");
        }
        
        try {
            Integer.parseInt(model.getUmur());
        } catch (NumberFormatException ex) {
            emsg.add("Invalid input in Umur");
        }
    }
}
