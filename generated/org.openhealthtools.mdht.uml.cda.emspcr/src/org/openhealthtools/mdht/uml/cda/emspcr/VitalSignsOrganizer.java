/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getVitalSignsOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.warning='emspcrVitalSignsOrganizerSystolicBloodPressureComponent emspcrVitalSignsOrganizerDiastolicBloodPressureComponent emspcrVitalSignsOrganizerHeartRateComponent emspcrVitalSignsOrganizerRespiratoryRateComponent emspcrVitalSignsOrganizerBodyTemperatureComponent emspcrVitalSignsOrganizerOxygenSaturationComponent' constraints.validation.error='emspcrVitalSignsOrganizerTemplateId emspcrVitalSignsOrganizerEffectiveTime' templateId.root='2.16.840.1.1133883.17.3.10.1.28'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerSystolicBloodPressureComponent constraints.validation.error='SystolicBloodPressureComponentSystolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerDiastolicBloodPressureComponent constraints.validation.error='DiastolicBloodPressureComponentDiastolicBloodPressure'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerHeartRateComponent constraints.validation.error='HeartRateComponentHeartRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerRespiratoryRateComponent constraints.validation.error='RespiratoryRateComponentRespiratoryRate'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerBodyTemperatureComponent constraints.validation.error='BodyTemperatureComponentBodyTemperature'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/emspcrVitalSignsOrganizerOxygenSaturationComponent constraints.validation.error='OxygenSaturationComponentOxygenSaturation'"
 * @generated
 */
public interface VitalSignsOrganizer extends org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerSystolicBloodPressureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerDiastolicBloodPressureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerHeartRateComponent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerRespiratoryRateComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerBodyTemperatureComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))'"
	* @generated
	*/
	boolean validateEmspcrVitalSignsOrganizerEmspcrVitalSignsOrganizerOxygenSaturationComponent(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateEmspcrVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public VitalSignsOrganizer init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // VitalSignsOrganizer
