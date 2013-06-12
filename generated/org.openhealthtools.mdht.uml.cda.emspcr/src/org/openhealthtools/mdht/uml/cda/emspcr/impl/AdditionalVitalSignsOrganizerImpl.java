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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose;
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide;
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide;
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness;
import org.openhealthtools.mdht.uml.cda.emspcr.PainScore;
import org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdditionalVitalSignsOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.impl.OrganizerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Vital Signs Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdditionalVitalSignsOrganizerImpl extends OrganizerImpl implements AdditionalVitalSignsOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalVitalSignsOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerStrokeScoreComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerStrokeScoreComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerPainScoreComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerPainScoreComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeScore getStrokeScoreComponent() {
		return AdditionalVitalSignsOrganizerOperations.getStrokeScoreComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PainScore getPainScoreComponent() {
		return AdditionalVitalSignsOrganizerOperations.getPainScoreComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfResponsiveness getLevelOfResponsivenessComponent() {
		return AdditionalVitalSignsOrganizerOperations.getLevelOfResponsivenessComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloodGlucose getBloodGlucoseComponent() {
		return AdditionalVitalSignsOrganizerOperations.getBloodGlucoseComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbonMonoxide getCarbonMonoxideComponent() {
		return AdditionalVitalSignsOrganizerOperations.getCarbonMonoxideComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbonDioxide getCarbonDioxideComponent() {
		return AdditionalVitalSignsOrganizerOperations.getCarbonDioxideComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacRhythm getCardiacRhythmComponent() {
		return AdditionalVitalSignsOrganizerOperations.getCardiacRhythmComponent(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlasgowComaScoreOrganizer> getGlasgowComaScoreOrganizers() {
		return AdditionalVitalSignsOrganizerOperations.getGlasgowComaScoreOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalVitalSignsOrganizer init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdditionalVitalSignsOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //AdditionalVitalSignsOrganizerImpl
