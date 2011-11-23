/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>The Assessment section (also called impression or diagnoses) represents the clinician's conclusions and working assumptions that will guide treatment of the patient. The assessment formulates a specific plan or set of recommendations. The assessment may be a list of specific disease entities or a narrative block.</p>
 * <p>The Plan section contains data that defines pending orders, interventions, encounters, services, and procedures for the patient. It is limited to prospective, unfulfilled, or incomplete orders and requests only. All active, incomplete, or pending orders, appointments, referrals, procedures, services, or any other pending event of clinical significance to the current care of the patient should be listed unless constrained due to privacy issues. The plan may also contain information about ongoing care of the patient and information regarding goals and clinical reminders. Clinical reminders are placed here to provide prompts for disease prevention and management, patient safety, and health-care quality improvements, including widely accepted performance measures. The plan may also indicate that patient education was given or will be provided.</p>
 * <p>
 *     The plan of care section contains data defining pending orders, interventions, encounters, services, and
 *     procedures for the patient. It is limited to prospective, unfulfilled, or incomplete orders and requests only. All
 *     active, incomplete, or pending orders, appointments, referrals, procedures, services, or any other pending event of
 *     clinical significance to the current and ongoing care of the patient should be listed, unless constrained due to issues
 *     of privacy.
 * </p>
 * <p>
 *     The plan of care section also contains information regarding goals and clinical reminders. Clinical
 *     reminders are placed here for purposes of providing prompts that may be used for disease prevention, disease
 *     management, patient safety, and healthcare quality improvements, including widely accepted performance measures.
 * </p>
 * The care plan section shall contain a narrative description of the expectations for care including proposals, goals, and
 * order requests for monitoring, tracking, or improving the condition of the patient.
 * <p>
 *     The Plan of Care Section contains information about the expectations for care to be provided including
 *     proposed interventions and goals for improving the condition of the patient. 
 * </p>
 * <p>
 *     A plan of care section varies from the assessment and plan section defined above in that it does not
 *     include a physician assessment of the patient condition. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPlanOfCareSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Treatment plan' templateId.root='2.16.840.1.113883.10.20.22.2.17' constraints.validation.error='PlanOfCareSectionTemplateId' code.codeSystemName='LOINC' code.code='18776-5'"
 * @generated
 */
public interface PlanOfCareSection extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.17')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.2.17\')'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection init();
} // PlanOfCareSection
