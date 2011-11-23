/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Guardian</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Represents the patient's sources of support such as immediate family, relatives, and guardian at the time the summarization is generated. Support information also includes next of kin, caregivers, and support organizations. At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included.</p>
 * <p>CDA R2 represents a patient's guardian with the CDA Header Guardian class. Other Supporters are represented as participant participations in the CDA Header.</p>
 * <p>Represents the patient's sources of support such as immediate family, relatives, and guardian at the time the summarization is generated. Support information also includes next of kin, caregivers, and support organizations. At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included.</p>
 * <p>CDA R2 represents a patient's guardian with the CDA Header Guardian class. Other Supporters are represented as participant participations in the CDA Header.</p>
 * At a minimum, key support contacts relative to healthcare decisions, including next of kin, should be included. If no healthcare providers are supplied, the reason should be supplied as free text in the narrative block (e.g., Unknown, etc).
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSupportGuardian()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.5.111' templateId.root='2.16.840.1.113883.3.88.11.83.3' constraints.validation.error='SupportGuardianTemplateId' code.codeSystemName='RoleCode'"
 * @generated
 */
public interface SupportGuardian extends Support {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.3')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.3\')'"
	 * @generated
	 */
	boolean validateSupportGuardianTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportGuardian init();
} // SupportGuardian
