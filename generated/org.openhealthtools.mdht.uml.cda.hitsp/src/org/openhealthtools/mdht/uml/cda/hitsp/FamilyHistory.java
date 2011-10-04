/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemStatusObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getFamilyHistory()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.18' constraints.validation.error='FamilyHistoryTemplateId FamilyHistoryRelatedSubjectCodeValueSet FamilyHistoryHasGenderCode FamilyHistoryFamilyMemberCondition' constraints.validation.warning='FamilyHistoryHasFamilyName FamilyHistoryProblemStatusObservation'"
 * @generated
 */
public interface FamilyHistory extends FamilyHistoryOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.code.codeSystem = '2.16.840.1.113883.1.11.19579'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.code.codeSystem = \'2.16.840.1.113883.1.11.19579\''"
	 * @generated
	 */
	boolean validateFamilyHistoryRelatedSubjectCodeValueSet(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.name->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.subject.name->size() > 0'"
	 * @generated
	 */
	boolean validateFamilyHistoryHasFamilyName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.subject.relatedSubject.subject.administrativeGenderCode.codeSystem = '2.16.840.1.113883.1.11.1'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject.relatedSubject.subject.administrativeGenderCode.codeSystem = \'2.16.840.1.113883.1.11.1\''"
	 * @generated
	 */
	boolean validateFamilyHistoryHasGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ihe::FamilyHistoryObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(obs : cda::Observation | obs.oclIsKindOf(ihe::FamilyHistoryObservation))'"
	 * @generated
	 */
	boolean validateFamilyHistoryFamilyMemberCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.18')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.18\')'"
	 * @generated
	 */
	boolean validateFamilyHistoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ihe::ProblemStatusObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ihe::ProblemStatusObservation))'"
	 * @generated
	 */
	boolean validateFamilyHistoryProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation)).oclAsType(ihe::ProblemStatusObservation)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemStatusObservation)).oclAsType(ihe::ProblemStatusObservation)'"
	 * @generated
	 */
	EList<ProblemStatusObservation> getProblemStatusObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistory init();
} // FamilyHistory
