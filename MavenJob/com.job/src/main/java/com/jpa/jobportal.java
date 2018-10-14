package com.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class jobportal {
	
		@Id
		int Candidate_ID;
		String Candidate_Name;
		String Candidate_SkillSet;
		int Candidate_Experience;

		public void setUserDetails(int candidateID, String candidateName, String skills, int exp) {
			// TODO Auto-generated method stub
			this.Candidate_ID = candidateID;
			this.Candidate_Name= candidateName;
			this.Candidate_SkillSet= skills;
			this.Candidate_Experience = exp;
		}
}
