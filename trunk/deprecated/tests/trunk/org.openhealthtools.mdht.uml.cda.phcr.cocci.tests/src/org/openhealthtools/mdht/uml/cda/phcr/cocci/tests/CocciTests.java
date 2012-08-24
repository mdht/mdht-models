/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cocci</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	CoccidioidesCaseReportTest.class
  	,CoccidioidesPHCRSocialHistorySectionTest.class
  	,CoccidioidesPossibleExposureLocationActTest.class
  	,CoccidioidesPHCRClinicalInformationSectionTest.class
  	,CoccidioidesCaseObservationTest.class
  	,CoccidioidesSignsAndSymptomsObservationTest.class
  	,CoccidioidesImmunosuppressedMedicalConditionHistoryObservationTest.class
  	,CoccidioidesImmunosuppressedMedicalConditionProblemObservationTest.class
  	,CoccidioidesPHCRTreatmentInformationSectionTest.class
  	,CoccidioidesTherapeuticRegimenActTest.class
  	,CoccidioidesTreatmentGivenSubstanceAdministrationTest.class
  	,CoccidioidesTreatmentNotGivenSubstanceAdministrationTest.class
  	,CoccidioidesPHCRRelevantDxTestsSectionTest.class
  	,CoccidioidesResultObservationTest.class
  	,CoccidioidesResultOrganizerTest.class
})
public class CocciTests {

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static junit.framework.Test suite() {
    return new JUnit4TestAdapter( CocciTests.class);
  }
	 

} //CocciTests