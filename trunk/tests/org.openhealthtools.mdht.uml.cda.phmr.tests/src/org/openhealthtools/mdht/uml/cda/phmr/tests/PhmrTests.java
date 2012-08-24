/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  Myriam Lipprandt <myriam.lipprandt@offis.de>, OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.tests;


import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>phmr</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	DeviceAccuracyObservationTest.class
  	,DeviceDefinitionOrganizerTest.class
  	,SamplingFrequencyObservationTest.class
  	,DeviceMeasurementRangeObservationTest.class
  	,DeviceResolutionObservationTest.class
  	,EventObservationTest.class
  	,MedicalEquipmentTest.class
  	,NumericObservationTest.class
  	,ObservationMediaJPGTest.class
  	,ObservationNullFlavorTest.class
  	,WaveformObservationTest.class
  	,WaveformSamplePeriodObservationTest.class
  	,ParticipantTest.class
  	,PersonalHealthcareMonitoringReportTest.class
  	,GeneralHeaderConstraintsTest.class
  	,VitalSignsTest.class
  	,ResultOrganizerTest.class
  	,WaveformSeriesObservationTest.class
  	,ResultsTest.class
  	,ParticipantRoleTest.class
  	,PHMRProductInstanceTest.class
  	,PHMRProductInstanceReferenceTest.class
  	,PlayingDeviceTest.class
  	,ScopingEntityTest.class
  	,VitalSignsOrganizerTest.class
  	,PurposeTest.class
  	,MedicationTest.class
  	,FunctionalStatusTest.class
})
public class PhmrTests {

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static junit.framework.Test suite() {
    return new JUnit4TestAdapter( PhmrTests.class);
  }
	 

} //PhmrTests