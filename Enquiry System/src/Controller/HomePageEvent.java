package Controller;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.HomePage;

public class HomePageEvent implements ActionListener {
HomePage obj;
	public HomePageEvent(HomePage homePage) {
		// TODO Auto-generated constructor stub
		obj=homePage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getActionCommand().equals("AddEnquiry"))
{
	EnquiryPage ep=new EnquiryPage();
	ep.setVisible(true);
	obj.setVisible(false);
	
	
}
if(e.getActionCommand().equals("UpdateEnquiry"))
	
{
	UpdatePage up=new UpdatePage();
	up.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("DeleteEnquiry"))
{
	DeletePage dp=new DeletePage();
	dp.setVisible(true);
	obj.setVisible(false);
}
if(e.getActionCommand().equals("ViewEnquiry"))
{
	ViewPage vp=new ViewPage();
	vp.setVisible(true);
	obj.setVisible(false);
}
if(e.getActionCommand().equals("AddCalling"))
	
{
	AddCallingPage ad=new AddCallingPage();
	ad.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("ViewCalling"))
	
{
	ViewCallingPage vc=new ViewCallingPage();
	vc.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("AddCourse"))
	
{
    CoursePage cp=new CoursePage();
	cp.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("UpdateCourse"))
	
{
    UpdateCourse uc=new UpdateCourse();
	uc.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("DeleteCourse"))
	
{
    DeleteCourse dc=new DeleteCourse();
	dc.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("ViewCourse"))
	
{
    ViewCourse vc=new ViewCourse();
	vc.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("AddRegistration"))
	
{
    Registration ar=new Registration();
	ar.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("ViewRegistration"))	
{
    ViewRegPage vrp=new ViewRegPage();
	vrp.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("AddFees"))
	
{
	
    FeesPage af=new FeesPage();
	af.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("ViewFees"))
	
{
	
    ViewFees vf=new  ViewFees();
	vf.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("Exit"))
	
{

	int a=JOptionPane.showOptionDialog(null,"Are You Sure to Exit?","Exit",JOptionPane.YES_NO_CANCEL_OPTION,0,null,null,null);
	if(a==0)
	{
	obj.setVisible(false);
	}
	
}
if(e.getActionCommand().equals("LogOut"))
	
{

   LoginPage Lp=new LoginPage();
	Lp.setVisible(true);
	obj.setVisible(false);;
}
if(e.getActionCommand().equals("ViewReports"))
{
	ViewReports vr=new ViewReports();
	vr.setVisible(true);
	obj.setVisible(false);
}
	}

	
}
