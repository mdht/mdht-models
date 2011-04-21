/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.operations.CauseOfDeathObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cause Of Death Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CauseOfDeathObservationImpl extends FamilyHistoryObservationImpl implements CauseOfDeathObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseOfDeathObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.CAUSE_OF_DEATH_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getTimeOfDeath() {
		return CauseOfDeathObservationOperations.getTimeOfDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOfDeath(IVL_TS value) {
		CauseOfDeathObservationOperations.setTimeOfDeath(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeAtDeath(IAgeObservation value) {
		CauseOfDeathObservationOperations.setAgeAtDeath(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation toCDAType() {
		return CauseOfDeathObservationOperations.toCDAType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IAgeObservation getAgeObservation() {
		return CauseOfDeathObservationOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFamilyHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CauseOfDeathObservationOperations.validateFamilyHistoryObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseOfDeathObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //CauseOfDeathObservationImpl
