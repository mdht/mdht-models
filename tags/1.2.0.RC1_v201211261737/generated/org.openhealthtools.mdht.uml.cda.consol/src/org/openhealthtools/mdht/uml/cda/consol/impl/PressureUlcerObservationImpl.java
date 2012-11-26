/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PressureUlcerObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Ulcer Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PressureUlcerObservationImpl extends ObservationImpl implements PressureUlcerObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PressureUlcerObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRESSURE_ULCER_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationHasTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationHasTextReference(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationHasTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationHasTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationValueNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationValueNullFlavor(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifier(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteQualifierName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierName(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteQualifierNameCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierNameCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteQualifierValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierValue(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteQualifierValueCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteQualifierValueCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationClassCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationNegationInd(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationValueP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationTargetSiteCodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1ClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1MoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1Observation1CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1CodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1Observation1Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1Code(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1Observation1Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1Value(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1TypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1TypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship1Observation1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship1Observation1(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2ClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2MoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2Observation2CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2CodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2Observation2Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2Code(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2Observation2Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2Value(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2TypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2TypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship2Observation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship2Observation2(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3ClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3MoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3Observation3CodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3CodeP(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3Observation3Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3Code(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3Observation3Value(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3Value(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3TypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3TypeCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePressureUlcerObservationEntryRelationship3Observation3(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PressureUlcerObservationOperations.validatePressureUlcerObservationEntryRelationship3Observation3(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PressureUlcerObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureUlcerObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PressureUlcerObservationImpl
