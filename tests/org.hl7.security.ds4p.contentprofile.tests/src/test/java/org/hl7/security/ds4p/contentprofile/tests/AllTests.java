/*******************************************************************************
 * Copyright (c) 2020 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     seanmuir - initial API and implementation
 *     
 *******************************************************************************/
package org.hl7.security.ds4p.contentprofile.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author seanmuir
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
		ConfidentialitySecurityObservationTest.class, MandatoryDocumentAssignedAuthorTest.class,
		MandatoryDocumentProvenanceTest.class, MandatoryEntryAssignedAuthorTest.class,
		MandatoryEntryProvenanceTest.class, ObligationPolicySecurityObservationTest.class,
		PrivacyAnnotationEntryRelationshipTest.class, PrivacyAnnotationTest.class, PrivacyMarkingsEntryTest.class,
		PrivacyMarkingsSectionTest.class, PrivacySegmentedDocumentTest.class, PrivacySegmentedSectionTest.class,
		ProtectedProblemTest.class, PurposeOfUseSecurityObservationTest.class,
		RefrainPolicySecurityObservationTest.class, SecurityObservationTest.class })
public class AllTests {

}
