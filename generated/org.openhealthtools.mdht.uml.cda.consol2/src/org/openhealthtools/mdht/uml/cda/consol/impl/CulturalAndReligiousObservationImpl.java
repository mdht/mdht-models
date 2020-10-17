/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.CulturalAndReligiousObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cultural And Religious Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CulturalAndReligiousObservationImpl extends ObservationImpl implements CulturalAndReligiousObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CulturalAndReligiousObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CULTURAL_AND_RELIGIOUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomed(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationValueOfTypeCDIsFromSnomed(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCulturalAndReligiousObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CulturalAndReligiousObservationOperations.validateCulturalAndReligiousObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CulturalAndReligiousObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CulturalAndReligiousObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CulturalAndReligiousObservationImpl
