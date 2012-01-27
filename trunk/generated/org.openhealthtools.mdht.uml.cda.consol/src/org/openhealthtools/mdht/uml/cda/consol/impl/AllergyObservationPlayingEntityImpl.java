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

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationPlayingEntityOperations;

import org.openhealthtools.mdht.uml.cda.impl.PlayingEntityImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Observation Playing Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyObservationPlayingEntityImpl extends PlayingEntityImpl implements AllergyObservationPlayingEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservationPlayingEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_OBSERVATION_PLAYING_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationPlayingEntityCodeOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityCodeOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationPlayingEntityCodeTranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityCodeTranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationPlayingEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservationPlayingEntity init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergyObservationPlayingEntityImpl
