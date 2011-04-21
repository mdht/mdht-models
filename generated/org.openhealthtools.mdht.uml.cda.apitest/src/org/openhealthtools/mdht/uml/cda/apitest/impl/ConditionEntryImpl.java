/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IComment;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IConditionEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.apitest.operations.ConditionEntryOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConditionEntryImpl extends ObservationImpl implements ConditionEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.CONDITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation toCDAType() {
		return ConditionEntryOperations.toCDAType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConditionEntry addId(II value) {
		return ConditionEntryOperations.addId(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getProblemType() {
		return ConditionEntryOperations.getProblemType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemType(CD value) {
		ConditionEntryOperations.setProblemType(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getProblemName() {
		return ConditionEntryOperations.getProblemName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemName(ED value) {
		ConditionEntryOperations.setProblemName(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getProblemDate() {
		return ConditionEntryOperations.getProblemDate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemDate(IVL_TS value) {
		ConditionEntryOperations.setProblemDate(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getProblemCode() {
		return ConditionEntryOperations.getProblemCode(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemCode(CD value) {
		ConditionEntryOperations.setProblemCode(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation getAgeObservation() {
		return ConditionEntryOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgeAtOnset(IAgeObservation value) {
		ConditionEntryOperations.setAgeAtOnset(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity getSeverity() {
		return ConditionEntryOperations.getSeverity(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(ISeverity value) {
		ConditionEntryOperations.setSeverity(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemStatusObservation getProblemStatusObservation() {
		return ConditionEntryOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemStatus(IProblemStatusObservation value) {
		ConditionEntryOperations.setProblemStatus(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation getHealthStatusObservation() {
		return ConditionEntryOperations.getHealthStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthStatusObservation(IHealthStatusObservation value) {
		ConditionEntryOperations.setHealthStatusObservation(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IComment> getComments() {
		return ConditionEntryOperations.getComments(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConditionEntry addComment(IComment value) {
		return ConditionEntryOperations.addComment(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation getCauseOfDeathObservation() {
		return ConditionEntryOperations.getCauseOfDeathObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseOfDeath(ICauseOfDeathObservation value) {
		ConditionEntryOperations.setCauseOfDeath(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCommentInversionInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCommentInversionInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasOnsetDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasOnsetDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasUnknownResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasUnknownResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntrySeverity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntrySeverity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryProblemStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryProblemStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHealthStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHealthStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCauseOfDeathObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCauseOfDeathObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ConditionEntryImpl
