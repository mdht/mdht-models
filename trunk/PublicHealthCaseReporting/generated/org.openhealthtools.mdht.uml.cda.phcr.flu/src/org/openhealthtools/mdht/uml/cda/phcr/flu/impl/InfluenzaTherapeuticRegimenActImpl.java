/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.flu.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaTreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.operations.InfluenzaTherapeuticRegimenActOperations;

import org.openhealthtools.mdht.uml.cda.phcr.impl.TherapeuticRegimenActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influenza Therapeutic Regimen Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InfluenzaTherapeuticRegimenActImpl extends TherapeuticRegimenActImpl implements InfluenzaTherapeuticRegimenAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaTherapeuticRegimenActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fluPackage.Literals.INFLUENZA_THERAPEUTIC_REGIMEN_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaTherapeuticRegimenActOperations.validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaTherapeuticRegimenActOperations.validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenzaTreatmentGivenSubstanceAdministration> getInfluenzaTreatmentGivenSubstanceAdministrations() {
		return InfluenzaTherapeuticRegimenActOperations.getInfluenzaTreatmentGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluenzaTreatmentNotGivenSubstanceAdministration> getInfluenzaTreatmentNotGivenSubstanceAdministrations() {
		return InfluenzaTherapeuticRegimenActOperations.getInfluenzaTreatmentNotGivenSubstanceAdministrations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTherapeuticRegimenActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InfluenzaTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenzaTherapeuticRegimenAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} //InfluenzaTherapeuticRegimenActImpl
