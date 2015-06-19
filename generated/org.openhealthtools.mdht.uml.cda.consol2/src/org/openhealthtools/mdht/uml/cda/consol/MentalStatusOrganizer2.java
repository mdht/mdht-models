/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mental Status Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getMentalStatusOrganizer2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ResultOrganizerTemplateId MentalStatusOrganizer2HasCodeOrEffectiveTime CognitiveStatusResultOrganizerCognitiveStatusResultObservation' templateId.root='2.16.840.1.113883.10.20.22.4.75' templateId.extension='2014-06-09' constraints.validation.warning='CognitiveStatusResultOrganizerCodeCodeSystem ResultOrganizerCode MentalStatusOrganizer2EffectiveTime MentalStatusOrganizer2CDCode' constraints.validation.query='MentalStatusOrganizer2CDCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolMentalStatusOrganizer2CD constraints.validation.warning='MentalStatusOrganizer2CDCode'"
 * @generated
 */
public interface MentalStatusOrganizer2 extends CognitiveStatusResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() or not self.effectiveTime.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateMentalStatusOrganizer2HasCodeOrEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateMentalStatusOrganizer2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateMentalStatusOrganizer2CDCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)).oclAsType(consol::MentalStatusObservation2)'"
	 * @generated
	 */
	EList<MentalStatusObservation2> getConsolMentalStatusObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusOrganizer2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // MentalStatusOrganizer2
