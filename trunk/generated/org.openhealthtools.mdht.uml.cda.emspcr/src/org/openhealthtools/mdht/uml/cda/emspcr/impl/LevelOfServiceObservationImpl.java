/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.LevelOfServiceObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Of Service Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LevelOfServiceObservationImpl extends ObservationImpl implements LevelOfServiceObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelOfServiceObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.LEVEL_OF_SERVICE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfServiceObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfServiceObservationOperations.validateLevelOfServiceObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfServiceObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfServiceObservationOperations.validateLevelOfServiceObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfServiceObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfServiceObservationOperations.validateLevelOfServiceObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfServiceObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfServiceObservationOperations.validateLevelOfServiceObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfServiceObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfServiceObservationOperations.validateLevelOfServiceObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOfServiceObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LevelOfServiceObservationOperations.validateLevelOfServiceObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfServiceObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfServiceObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // LevelOfServiceObservationImpl
