/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;
import org.openhealthtools.mdht.uml.cda.consol.BrandNameObservation;
import org.openhealthtools.mdht.uml.cda.consol.CatalogNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.CompanyNameObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation;
import org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation;
import org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.LatexSafetyObservation;
import org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation;
import org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation;
import org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer;

import org.openhealthtools.mdht.uml.cda.consol.operations.UDIOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDI Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UDIOrganizerImpl extends OrganizerImpl implements UDIOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDIOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.UDI_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerDeviceIdentifierObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerDeviceIdentifierObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerLotOrBatchNumberObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerLotOrBatchNumberObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerSerialNumberObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerSerialNumberObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerManufacturingDateObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerManufacturingDateObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerExpirationDateObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerExpirationDateObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerDistinctIdentificationCodeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerDistinctIdentificationCodeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerBrandNameObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerBrandNameObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerModelNumberObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerModelNumberObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerCompanyNameObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerCompanyNameObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerCatalogNumberObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerCatalogNumberObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerLatexSafetyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerLatexSafetyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerMRISafetyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerMRISafetyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUDIOrganizerImplantableDeviceStatusObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UDIOrganizerOperations.validateUDIOrganizerImplantableDeviceStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceIdentifierObservation getDeviceIdentifierObservation() {
		return UDIOrganizerOperations.getDeviceIdentifierObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LotOrBatchNumberObservation getLotOrBatchNumberObservation() {
		return UDIOrganizerOperations.getLotOrBatchNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerialNumberObservation getSerialNumberObservation() {
		return UDIOrganizerOperations.getSerialNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingDateObservation getManufacturingDateObservation() {
		return UDIOrganizerOperations.getManufacturingDateObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpirationDateObservation getExpirationDateObservation() {
		return UDIOrganizerOperations.getExpirationDateObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinctIdentificationCodeObservation getDistinctIdentificationCodeObservation() {
		return UDIOrganizerOperations.getDistinctIdentificationCodeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrandNameObservation getBrandNameObservation() {
		return UDIOrganizerOperations.getBrandNameObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNumberObservation getModelNumberObservation() {
		return UDIOrganizerOperations.getModelNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyNameObservation getCompanyNameObservation() {
		return UDIOrganizerOperations.getCompanyNameObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogNumberObservation getCatalogNumberObservation() {
		return UDIOrganizerOperations.getCatalogNumberObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatexSafetyObservation getLatexSafetyObservation() {
		return UDIOrganizerOperations.getLatexSafetyObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRISafetyObservation getMRISafetyObservation() {
		return UDIOrganizerOperations.getMRISafetyObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplantableDeviceStatusObservation getImplantableDeviceStatusObservation() {
		return UDIOrganizerOperations.getImplantableDeviceStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDIOrganizer init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UDIOrganizer init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //UDIOrganizerImpl
