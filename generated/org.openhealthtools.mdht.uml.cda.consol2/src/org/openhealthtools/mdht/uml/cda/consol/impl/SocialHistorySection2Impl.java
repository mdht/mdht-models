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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistorySection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social History Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SocialHistorySection2Impl extends SocialHistorySectionImpl implements SocialHistorySection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistorySection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySection2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySection2CaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySection2CaregiverCharacteristics(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySection2CulturalAndReligiousObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySection2CulturalAndReligiousObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySection2CharacteristicsOfHomeEnvironment(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySection2CharacteristicsOfHomeEnvironment(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection2BirthSexObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySection2BirthSexObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SocialHistoryObservation2> getConsolSocialHistoryObservation2s() {
		return SocialHistorySection2Operations.getConsolSocialHistoryObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmokingStatusMeaningfulUse2> getConsolCurrentSmokingStatus2s() {
		return SocialHistorySection2Operations.getConsolCurrentSmokingStatus2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TobaccoUse2> getConsolTobaccoUse2s() {
		return SocialHistorySection2Operations.getConsolTobaccoUse2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return SocialHistorySection2Operations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CulturalAndReligiousObservation> getCulturalAndReligiousObservations() {
		return SocialHistorySection2Operations.getCulturalAndReligiousObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacteristicsOfHomeEnvironment> getCharacteristicsOfHomeEnvironments() {
		return SocialHistorySection2Operations.getCharacteristicsOfHomeEnvironments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BirthSexObservation> getBirthSexObservations() {
		return SocialHistorySection2Operations.getBirthSexObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionSocialHistoryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySectionSocialHistoryObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionSmokingStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySectionSmokingStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistorySectionTobaccoUse(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SocialHistorySection2Operations.validateSocialHistorySectionTobaccoUse(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SocialHistorySection2Impl
