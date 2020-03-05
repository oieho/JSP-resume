package dao;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.Model;
import model.Model2;

@WebServlet("/fileup")
public class fileUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	request.setCharacterEncoding("utf-8");
		
		String pimgfile2 = (String) request.getParameter("fileUploaded2");
		String fileupload = request.getParameter("filename1");
		String korname = request.getParameter("korname");
		String wishfield = request.getParameter("wishfield");
		String engName = request.getParameter("engname");
		String wishcareer = request.getParameter("wishcareer");
		String recommperson = request.getParameter("recommperson");
		String birth = request.getParameter("birth");
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
			
		String fromhighschoolyy = 	request.getParameter("fromhighschoolyy");
		String fromhighschoolmm = 	request.getParameter("fromhighschoolmm");
		String tohighschoolyy = request.getParameter("tohighschoolyy");
		String tohighschoolmm = request.getParameter("tohighschoolmm");
		String fromcollegeyy = request.getParameter("fromcollegeyy");
		String fromcollegemm = request.getParameter("fromcollegemm");
		String tocollegeyy = request.getParameter("tocollegeyy");
		String tocollegemm = request.getParameter("tocollegemm");
		String fromuniversityyy = request.getParameter("fromuniversityyy");
		String fromuniversitymm = request.getParameter("fromuniversitymm");
		String touniversityyy = request.getParameter("touniversityyy");
		String touniversitymm = request.getParameter("touniversitymm");
		String frommasteryy = request.getParameter("frommasteryy");
		String frommastermm = request.getParameter("frommastermm");
		String tomasteryy = request.getParameter("tomasteryy");
		String tomastermm = request.getParameter("tomastermm");
		String fromdoctoryy = request.getParameter("fromdoctoryy");
		String fromdoctormm = request.getParameter("fromdoctormm");
		String todoctoryy = request.getParameter("todoctoryy");
		String todoctormm = request.getParameter("todoctormm");
	    String highschool = request.getParameter("highschool");
	    String college1 = request.getParameter("college1");
	    String college2 = request.getParameter("college2");
	    String collegedepartment = request.getParameter("collegedepartment");
	    String collegelocation = request.getParameter("collegelocation");
	    String collegesubduplicatemajor = request.getParameter("collegesubduplicatemajor");
	    String university1 = request.getParameter("university1");
	    String university2 = request.getParameter("university2");
	    String universitydepartment = request.getParameter("universitydepartment");
	    String universitylocation = request.getParameter("universitylocation");
	    String universitysubduplicatemajor = request.getParameter("universitysubduplicatemajor");
	    String master1 = request.getParameter("master1");
	    String master2 = request.getParameter("master2");
	    String masterdepartment = request.getParameter("masterdepartment");
	    String masterlocation = request.getParameter("masterlocation");
	    String mastersubduplicatemajor = request.getParameter("mastersubduplicatemajor");
	    String doctor1 = request.getParameter("doctor1");
	    String doctor2 = request.getParameter("doctor2");
	    String doctordepartment = request.getParameter("doctordepartment");
	    String doclocation = request.getParameter("doclocation");
	    String detailmajor = request.getParameter("detailmajor");
	    String papertitle = request.getParameter("papertitle");
	    String absencetermreason = request.getParameter("absencetermreason");

		String schoolyear11 = request.getParameter("schoolyear11");
		String schoolyear12 = request.getParameter("schoolyear12");
		String schoolyear21 = request.getParameter("schoolyear21");
		String schoolyear22 = request.getParameter("schoolyear22");
		String schoolyear31 = request.getParameter("schoolyear31");
		String schoolyear32 = request.getParameter("schoolyear32");
		String schoolyear41 = request.getParameter("schoolyear41");
		String schoolyear42 = request.getParameter("schoolyear42");
		String universityaverage1 = request.getParameter("universityaverage1");
		String universityaverage2 = request.getParameter("universityaverage2");
		String master11 = request.getParameter("master11");
		String master12 = request.getParameter("master12");
		String master21 = request.getParameter("master21");
		String master22 = request.getParameter("master22");
		String masteraverage1 = request.getParameter("masteraverage1");
		String masteraverage2 = request.getParameter("masteraverage2");
		
        String military = request.getParameter("military");
        String exemption = request.getParameter("exemption");
        String exemptionreason = request.getParameter("exemptionreason");
        String notfinished = request.getParameter("notfinished");
        String preparedDate = request.getParameter("preparedDate");
        String notrelative = request.getParameter("notrelative");
        String branch = request.getParameter("branch");
        String estate = request.getParameter("estate");
        String activeduty = request.getParameter("activeduty");
        String supplementduty = request.getParameter("supplementduty");

		String cm = request.getParameter("cm");
		String kg = request.getParameter("kg");
		String peculiar = request.getParameter("peculiar");
		

		Model2 model = new Model2();
		model.setFileupload(pimgfile2);
		model.setKorname(korname);
		model.setWishfield(wishfield);
		model.setEngname(engName);
		model.setWishcareer(wishcareer);
		model.setRecommperson(recommperson);

		model.setBirth(birth);
		model.setAddr(addr);
		model.setEmail(email);
		model.setPhone(phone);

		model.setFromhighschoolyy(fromhighschoolyy);
		model.setFromhighschoolmm(fromhighschoolmm);
		model.setTohighschoolyy(tohighschoolyy);
		model.setTohighschoolmm(tohighschoolmm);
		model.setFromcollegeyy(fromcollegeyy);
		model.setFromcollegemm(fromcollegemm);
		model.setTocollegeyy(tocollegeyy);
		model.setTocollegemm(tocollegemm);
		model.setFromuniversityyy(fromuniversityyy);
		model.setFromuniversitymm(fromuniversitymm);
		model.setTouniversityyy(touniversityyy);
		model.setTouniversitymm(touniversitymm);
		model.setFrommasteryy(frommasteryy);
		model.setFrommastermm(frommastermm);
		model.setTomasteryy(tomasteryy);
		model.setTomastermm(tomastermm);
		model.setFromdoctoryy(fromdoctoryy);
		model.setFromdoctormm(fromdoctormm);
		model.setTodoctoryy(todoctoryy);
		model.setTodoctormm(todoctormm);
		model.setHighschool(highschool);
		model.setCollege1(college1);
		model.setCollege2(college2);
		model.setCollegedepartment(collegedepartment);
		model.setCollegelocation(collegelocation);
		model.setCollegesubduplicatemajor(collegesubduplicatemajor);
		model.setUniversity1(university1);
		model.setUniversity2(university2);
		model.setUniversitydepartment(universitydepartment);
		model.setUniversitylocation(universitylocation);
		model.setUniversitysubduplicatemajor(universitysubduplicatemajor);
		model.setMaster1(master1);
		model.setMaster2(master2);
		model.setMasterdepartment(masterdepartment);
		model.setMasterlocation(masterlocation);
		model.setMastersubduplicatemajor(mastersubduplicatemajor);
		model.setDoctor1(doctor1);
		model.setDoctor2(doctor2);
		model.setDoctordepartment(doctordepartment);
		model.setDoclocation(doclocation);
		model.setDetailmajor(detailmajor);
		model.setPapertitle(papertitle);
		model.setAbsencetermreason(absencetermreason);

		model.setSchoolyear11(schoolyear11);
		model.setSchoolyear12(schoolyear12);
		model.setSchoolyear21(schoolyear21);
		model.setSchoolyear22(schoolyear22);
		model.setSchoolyear31(schoolyear31);
		model.setSchoolyear32(schoolyear32);
		model.setSchoolyear41(schoolyear41);
		model.setSchoolyear42(schoolyear42);
		model.setUniversityaverage1(universityaverage1);
		model.setUniversityaverage2(universityaverage2);
		model.setMaster11(master11);
		model.setMaster12(master12);
		model.setMaster21(master21);
		model.setMaster22(master22);
		model.setMasteraverage1(masteraverage1);
		model.setMasteraverage2(masteraverage2);

		model.setMilitary(military);
		model.setExemption(exemption);
		model.setExemptionreason(exemptionreason);
		model.setNotfinished(notfinished);
		model.setPreparedDate(preparedDate);
		model.setNotrelative(notrelative);
		model.setBranch(branch);
		model.setEstate(estate);
		model.setActiveduty(activeduty);
		model.setSupplementduty(supplementduty);

		model.setCm(cm);
		model.setKg(kg);
		model.setPeculiar(peculiar);

		

		request.setAttribute("Model2", model);


		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uploadPath = request.getSession().getServletContext().getRealPath("upload");

		int size = 10 * 1024 * 1024; //1024형태로 써야함

		String filename1 = "";
		String fileupload = "";
		String korname = "";
		String wishfield = "";
		String engName = "";
		String wishcareer = "";
		String recommperson = "";
		String birth = "";
		String addr = "";
		String email = "";
		String phone = "";
		
		int fromhighschoolyy = 0;
		int fromhighschoolmm = 0;
		int tohighschoolyy = 0;
		int tohighschoolmm = 0;
		int fromcollegeyy = 0;
		int fromcollegemm = 0;
		int tocollegeyy = 0;
		int tocollegemm = 0;
		int fromuniversityyy = 0;
		int fromuniversitymm = 0;
		int touniversityyy = 0;
		int touniversitymm = 0;
		int frommasteryy = 0;
		int frommastermm = 0;
		int tomasteryy = 0;
		int tomastermm = 0;
		int fromdoctoryy = 0;
		int fromdoctormm = 0;
		int todoctoryy = 0;
		int todoctormm = 0;
		String highschool = "";
		String college1 = "";
		String college2 = "";
		String collegedepartment = "";
		String collegelocation = "";
		String collegesubduplicatemajor = "";
		String university1 = "";
		String university2 = "";
		String universitydepartment = "";
		String universitylocation = "";
		String universitysubduplicatemajor = "";
		String master1 = "";
		String master2 = "";
		String masterdepartment = "";
		String masterlocation ="";
		String mastersubduplicatemajor = "";
		String doctor1 = "";
		String doctor2 = "";
		String doctordepartment = "";
		String doclocation = "";
		String detailmajor = "";
		String papertitle = "";
		String absencetermreason = "";
		
		float schoolyear11 = 0;
		float schoolyear12 = 0;
		float schoolyear21 = 0;
		float schoolyear22 = 0;
		float schoolyear31 = 0;
		float schoolyear32 = 0;
		float schoolyear41 = 0;
		float schoolyear42 = 0;
		float universityaverage1 = 0;
		float universityaverage2 = 0;
		float master11 = 0;
		float master12 = 0;
		float master21 = 0;
		float master22 = 0;
		float masteraverage1 = 0;
		float masteraverage2 = 0;
		
		String military = "";
		String exemption = "";
		String exemptionreason = "";
		String notfinished = "";
		String preparedDate = "";
		String notrelative = "";
		String branch = "";
		String estate = "";
		String activeduty = "";
		String supplementduty = "";

		String cm = "";
		String kg = "";
		String peculiar = "";
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());

			Enumeration files = multi.getFileNames(); // 열거 타입으로 반환받아야함 

			String file1 = (String) files.nextElement();
			filename1 = multi.getFilesystemName(file1);
			request.setAttribute("abcdefg", filename1);
			fileupload = multi.getParameter("filename1");
			korname = multi.getParameter("korname");
			wishfield = multi.getParameter("wishfield");
			engName = multi.getParameter("engname");
			wishcareer = multi.getParameter("wishcareer");
			recommperson = multi.getParameter("recommperson");
			birth = multi.getParameter("birth");
			addr = multi.getParameter("addr");
			email = multi.getParameter("email");
			phone = multi.getParameter("phone");
			
			fromhighschoolyy = Integer.parseInt(multi.getParameter("fromhighschoolyy"));
			fromhighschoolmm = Integer.parseInt(multi.getParameter("fromhighschoolmm"));
			tohighschoolyy = Integer.parseInt(multi.getParameter("tohighschoolyy"));
			tohighschoolmm = Integer.parseInt(multi.getParameter("tohighschoolmm"));
			fromcollegeyy = Integer.parseInt(multi.getParameter("fromcollegeyy"));
			fromcollegemm = Integer.parseInt(multi.getParameter("fromcollegemm"));
			tocollegeyy = Integer.parseInt(multi.getParameter("tocollegeyy"));
			tocollegemm = Integer.parseInt(multi.getParameter("tocollegemm"));
			fromuniversityyy = Integer.parseInt(multi.getParameter("fromuniversityyy"));
			fromuniversitymm = Integer.parseInt(multi.getParameter("fromuniversitymm"));
			touniversityyy = Integer.parseInt(multi.getParameter("touniversityyy"));
			touniversitymm = Integer.parseInt(multi.getParameter("touniversitymm"));
			frommasteryy = Integer.parseInt(multi.getParameter("frommasteryy"));
			frommastermm = Integer.parseInt(multi.getParameter("frommastermm"));
			tomasteryy = Integer.parseInt(multi.getParameter("tomasteryy"));
			tomastermm = Integer.parseInt(multi.getParameter("tomastermm"));
			fromdoctoryy = Integer.parseInt(multi.getParameter("fromdoctoryy"));
			fromdoctormm = Integer.parseInt(multi.getParameter("fromdoctormm"));
			todoctoryy = Integer.parseInt(multi.getParameter("todoctoryy"));
			todoctormm = Integer.parseInt(multi.getParameter("todoctormm"));
			highschool = multi.getParameter("highschool");
			college1 = multi.getParameter("college1");
			college2 = multi.getParameter("college2");
			collegedepartment = multi.getParameter("collegedepartment");
			collegelocation = multi.getParameter("collegelocation");
			collegesubduplicatemajor = multi.getParameter("collegesubduplicatemajor");
			university1 = multi.getParameter("university1");
			university2 = multi.getParameter("university2");
			universitydepartment = multi.getParameter("universitydepartment");
			universitylocation = multi.getParameter("universitylocation");
			universitysubduplicatemajor = multi.getParameter("universitysubduplicatemajor");
			master1 = multi.getParameter("master1");
			master2 = multi.getParameter("master2");
			masterdepartment = multi.getParameter("masterdepartment");
			masterlocation = multi.getParameter("masterlocation");
			mastersubduplicatemajor = multi.getParameter("mastersubduplicatemajor");
			doctor1 = multi.getParameter("doctor1");
			doctor2 = multi.getParameter("doctor2");
			doctordepartment = multi.getParameter("doctordepartment");
			doclocation = multi.getParameter("doclocation");
			detailmajor = multi.getParameter("detailmajor");
			papertitle = multi.getParameter("papertitle");
			absencetermreason = multi.getParameter("absencetermreason");
			
			schoolyear11 = Float.parseFloat(multi.getParameter("schoolyear11"));
			schoolyear12 = Float.parseFloat(multi.getParameter("schoolyear12"));
			schoolyear21 = Float.parseFloat(multi.getParameter("schoolyear21"));
			schoolyear22 = Float.parseFloat(multi.getParameter("schoolyear22"));
			schoolyear31 = Float.parseFloat(multi.getParameter("schoolyear31"));
			schoolyear32 = Float.parseFloat(multi.getParameter("schoolyear32"));
			schoolyear41 = Float.parseFloat(multi.getParameter("schoolyear41"));
			schoolyear42 = Float.parseFloat(multi.getParameter("schoolyear42"));

			master11 = Float.parseFloat(multi.getParameter("master11"));
			master21 = Float.parseFloat(multi.getParameter("master21"));
			master12 = Float.parseFloat(multi.getParameter("master12"));
			master22 = Float.parseFloat(multi.getParameter("master22"));

			military = multi.getParameter("military");
			exemption = multi.getParameter("exemption");
			exemptionreason = multi.getParameter("exemptionreason");
			notfinished = multi.getParameter("notfinished");
			preparedDate = multi.getParameter("preparedDate");
			notrelative = multi.getParameter("notrelative");
			branch = multi.getParameter("branch");
			estate = multi.getParameter("estate");
			activeduty = multi.getParameter("activeduty");
			supplementduty = multi.getParameter("supplementduty");

			cm = multi.getParameter("cm");
			kg = multi.getParameter("kg");
			peculiar = multi.getParameter("peculiar");
		} catch (Exception e) {
			System.out.println("UPLOAD ERR : " + e.getMessage());
		}


		Model model = new Model();
		model.setFileupload(fileupload);
		model.setKorname(korname);
		model.setWishfield(wishfield);
		model.setEngname(engName);
		model.setWishcareer(wishcareer);
		model.setRecommperson(recommperson);

		model.setBirth(birth);
		model.setAddr(addr);
		model.setEmail(email);
		model.setPhone(phone);

		model.setFromhighschoolyy(fromhighschoolyy);
		model.setFromhighschoolmm(fromhighschoolmm);
		model.setTohighschoolyy(tohighschoolyy);
		model.setTohighschoolmm(tohighschoolmm);
		model.setFromcollegeyy(fromcollegeyy);
		model.setFromcollegemm(fromcollegemm);
		model.setTocollegeyy(tocollegeyy);
		model.setTocollegemm(tocollegemm);
		model.setFromuniversityyy(fromuniversityyy);
		model.setFromuniversitymm(fromuniversitymm);
		model.setTouniversityyy(touniversityyy);
		model.setTouniversitymm(touniversitymm);
		model.setFrommasteryy(frommasteryy);
		model.setFrommastermm(frommastermm);
		model.setTomasteryy(tomasteryy);
		model.setTomastermm(tomastermm);
		model.setFromdoctoryy(fromdoctoryy);
		model.setFromdoctormm(fromdoctormm);
		model.setTodoctoryy(todoctoryy);
		model.setTodoctormm(todoctormm);
		model.setHighschool(highschool);
		model.setCollege1(college1);
		model.setCollege2(college2);
		model.setCollegedepartment(collegedepartment);
		model.setCollegelocation(collegelocation);
		model.setCollegesubduplicatemajor(collegesubduplicatemajor);
		model.setUniversity1(university1);
		model.setUniversity2(university2);
		model.setUniversitydepartment(universitydepartment);
		model.setUniversitylocation(universitylocation);
		model.setUniversitysubduplicatemajor(universitysubduplicatemajor);
		model.setMaster1(master1);
		model.setMaster2(master2);
		model.setMasterdepartment(masterdepartment);
		model.setMasterlocation(masterlocation);
		model.setMastersubduplicatemajor(mastersubduplicatemajor);
		model.setDoctor1(doctor1);
		model.setDoctor2(doctor2);
		model.setDoctordepartment(doctordepartment);
		model.setDoclocation(doclocation);
		model.setDetailmajor(detailmajor);
		model.setPapertitle(papertitle);
		model.setAbsencetermreason(absencetermreason);

		model.setSchoolyear11(schoolyear11);
		model.setSchoolyear12(schoolyear12);
		model.setSchoolyear21(schoolyear21);
		model.setSchoolyear22(schoolyear22);
		model.setSchoolyear31(schoolyear31);
		model.setSchoolyear32(schoolyear32);
		model.setSchoolyear41(schoolyear41);
		model.setSchoolyear42(schoolyear42);
		model.setUniversityaverage1(universityaverage1);
		model.setUniversityaverage2(universityaverage2);
		model.setMaster11(master11);
		model.setMaster12(master12);
		model.setMaster21(master21);
		model.setMaster22(master22);
		model.setMasteraverage1(masteraverage1);
		model.setMasteraverage2(masteraverage2);

		model.setMilitary(military);
		model.setExemption(exemption);
		model.setExemptionreason(exemptionreason);
		model.setNotfinished(notfinished);
		model.setPreparedDate(preparedDate);
		model.setNotrelative(notrelative);
		model.setBranch(branch);
		model.setEstate(estate);
		model.setActiveduty(activeduty);
		model.setSupplementduty(supplementduty);

		model.setCm(cm);
		model.setKg(kg);
		model.setPeculiar(peculiar);

		
		dao Dao = new dao();

		request.setAttribute("Model", model);
		Dao.insert1(model);
		Dao.insert2(model);
		Dao.insert3(model);
		Dao.insert4(model);
		Dao.insert5(model);
		Dao.insert6(model);


		RequestDispatcher requestDispatcher = request.getRequestDispatcher("resumeResult.jsp");
		requestDispatcher.forward(request, response);

	}

}
