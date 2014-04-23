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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowComaScoreOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glasgow Coma Score Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GlasgowComaScoreOrganizerImpl extends OrganizerImpl implements GlasgowComaScoreOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlasgowComaScoreOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.GLASGOW_COMA_SCORE_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerGlasgowEye(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowEye(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerGlasgowMotor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowMotor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerGlasgowQualifier(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowQualifier(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerGlasgowTotal(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowTotal(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerGlasgowVerbal(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowVerbal(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlasgowComaScoreOrganizerEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowEye getGlasgowEye() {
		return GlasgowComaScoreOrganizerOperations.getGlasgowEye(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowMotor getGlasgowMotor() {
		return GlasgowComaScoreOrganizerOperations.getGlasgowMotor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowQualifier getGlasgowQualifier() {
		return GlasgowComaScoreOrganizerOperations.getGlasgowQualifier(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowTotal getGlasgowTotal() {
		return GlasgowComaScoreOrganizerOperations.getGlasgowTotal(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowVerbal getGlasgowVerbal() {
		return GlasgowComaScoreOrganizerOperations.getGlasgowVerbal(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowComaScoreOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowComaScoreOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // GlasgowComaScoreOrganizerImpl
