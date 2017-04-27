/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerCaseTransfer;
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathReportDocumentBodyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death Report Document Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeathReportDocumentBodyImpl extends SectionImpl implements DeathReportDocumentBody {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeathReportDocumentBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.DEATH_REPORT_DOCUMENT_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyTimeofDeath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTimeofDeath(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyLocationOfDeath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyLocationOfDeath(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyCertifyingDeath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCertifyingDeath(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyMannerOfDeath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyMannerOfDeath(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyPregnancyStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyPregnancyStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyTobaccoUse(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTobaccoUse(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyInjury(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyInjury(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyCauseOfDeath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCauseOfDeath(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyAutopsyPerformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyAutopsyPerformance(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyAutopsyResults(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyAutopsyResults(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyCoronerReferral(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCoronerReferral(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyCoronerCaseTransfer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCoronerCaseTransfer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyDeathLocationType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyDeathLocationType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDeathReportDocumentBodyPronouncingDeath(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyPronouncingDeath(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateandTimeofDeath getTimeofDeath() {
		return DeathReportDocumentBodyOperations.getTimeofDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationofDeath getLocationOfDeath() {
		return DeathReportDocumentBodyOperations.getLocationOfDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertifyingDeath getCertifyingDeath() {
		return DeathReportDocumentBodyOperations.getCertifyingDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MannerofDeath getMannerOfDeath() {
		return DeathReportDocumentBodyOperations.getMannerOfDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PregnancyStatus getPregnancyStatus() {
		return DeathReportDocumentBodyOperations.getPregnancyStatus(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TobaccoUse getTobaccoUse() {
		return DeathReportDocumentBodyOperations.getTobaccoUse(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Injury getInjury() {
		return DeathReportDocumentBodyOperations.getInjury(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathCausalInformation getCauseOfDeath() {
		return DeathReportDocumentBodyOperations.getCauseOfDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutopsyPerformance getAutopsyPerformance() {
		return DeathReportDocumentBodyOperations.getAutopsyPerformance(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutopsyResults getAutopsyResults() {
		return DeathReportDocumentBodyOperations.getAutopsyResults(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoronerReferral getCoronerReferral() {
		return DeathReportDocumentBodyOperations.getCoronerReferral(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoronerCaseTransfer getCoronerCaseTransfer() {
		return DeathReportDocumentBodyOperations.getCoronerCaseTransfer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathLocationType getDeathLocationType() {
		return DeathReportDocumentBodyOperations.getDeathLocationType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PronouncingDeath getPronouncingDeath() {
		return DeathReportDocumentBodyOperations.getPronouncingDeath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathReportDocumentBody init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DeathReportDocumentBody init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //DeathReportDocumentBodyImpl
