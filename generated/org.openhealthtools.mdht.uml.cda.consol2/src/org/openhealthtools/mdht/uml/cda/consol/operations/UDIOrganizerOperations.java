/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

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

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>UDI Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerDeviceIdentifierObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Device Identifier Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerLotOrBatchNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Lot Or Batch Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerSerialNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Serial Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerManufacturingDateObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Manufacturing Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerExpirationDateObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Expiration Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerDistinctIdentificationCodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Distinct Identification Code Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerBrandNameObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Brand Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerModelNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Model Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCompanyNameObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Company Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerCatalogNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Catalog Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerLatexSafetyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Latex Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerMRISafetyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer MRI Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#validateUDIOrganizerImplantableDeviceStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Implantable Device Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getDeviceIdentifierObservation() <em>Get Device Identifier Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getLotOrBatchNumberObservation() <em>Get Lot Or Batch Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getSerialNumberObservation() <em>Get Serial Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getManufacturingDateObservation() <em>Get Manufacturing Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getExpirationDateObservation() <em>Get Expiration Date Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getDistinctIdentificationCodeObservation() <em>Get Distinct Identification Code Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getBrandNameObservation() <em>Get Brand Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getModelNumberObservation() <em>Get Model Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getCompanyNameObservation() <em>Get Company Name Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getCatalogNumberObservation() <em>Get Catalog Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getLatexSafetyObservation() <em>Get Latex Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getMRISafetyObservation() <em>Get MRI Safety Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UDIOrganizer#getImplantableDeviceStatusObservation() <em>Get Implantable Device Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UDIOrganizerOperations extends OrganizerOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDIOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerTemplateId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerTemplateId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.311' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerTemplateId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerTemplateId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerTemplateId(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerTemplateId", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerTemplateId"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerId(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerId(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerId", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_ID,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerId"), new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerCodeP(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerCodeP", "INFO");

		if (VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_CODE_P,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerCodeP"),
						new Object[] { udiOrganizer }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerCodeP", passToken);
				}
				passToken.add(udiOrganizer);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerCode(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(udiOrganizer)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerCode", "INFO");

		if (VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_CODE,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerCode"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerStatusCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerStatusCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerStatusCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerStatusCodeP(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerStatusCodeP(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerStatusCodeP", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerStatusCodeP"),
						new Object[] { udiOrganizer }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerStatusCodeP", passToken);
				}
				passToken.add(udiOrganizer);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerStatusCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerStatusCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerStatusCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerStatusCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerStatusCode(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.UDIOrganizerStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(udiOrganizer)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerStatusCode", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerStatusCode"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerClassCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerClassCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerClassCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerClassCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerClassCode(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerClassCode", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerClassCode"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerMoodCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerMoodCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerMoodCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerMoodCode(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerMoodCode(UDIOrganizer udiOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerMoodCode", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_UDI_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerMoodCode"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerDeviceIdentifierObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Device Identifier Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerDeviceIdentifierObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::DeviceIdentifierObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerDeviceIdentifierObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Device Identifier Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerDeviceIdentifierObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerDeviceIdentifierObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerDeviceIdentifierObservation", "ERROR");

		if (VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_DEVICE_IDENTIFIER_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerDeviceIdentifierObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerLotOrBatchNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Lot Or Batch Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerLotOrBatchNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::LotOrBatchNumberObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerLotOrBatchNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Lot Or Batch Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerLotOrBatchNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerLotOrBatchNumberObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerLotOrBatchNumberObservation", "WARNING");

		if (VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_LOT_OR_BATCH_NUMBER_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerLotOrBatchNumberObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerSerialNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Serial Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerSerialNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::SerialNumberObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerSerialNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Serial Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerSerialNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerSerialNumberObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerSerialNumberObservation", "WARNING");

		if (VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_SERIAL_NUMBER_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerSerialNumberObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerManufacturingDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Manufacturing Date Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerManufacturingDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::ManufacturingDateObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerManufacturingDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Manufacturing Date Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerManufacturingDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerManufacturingDateObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerManufacturingDateObservation", "WARNING");

		if (VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_MANUFACTURING_DATE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerManufacturingDateObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerExpirationDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Expiration Date Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerExpirationDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::ExpirationDateObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerExpirationDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Expiration Date Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerExpirationDateObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerExpirationDateObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerExpirationDateObservation", "WARNING");

		if (VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_EXPIRATION_DATE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerExpirationDateObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerDistinctIdentificationCodeObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Distinct Identification Code Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerDistinctIdentificationCodeObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::DistinctIdentificationCodeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerDistinctIdentificationCodeObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Distinct Identification Code Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerDistinctIdentificationCodeObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerDistinctIdentificationCodeObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerDistinctIdentificationCodeObservation", "WARNING");

		if (VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_DISTINCT_IDENTIFICATION_CODE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"UDIOrganizerUDIOrganizerDistinctIdentificationCodeObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerBrandNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Brand Name Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerBrandNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::BrandNameObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerBrandNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Brand Name Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerBrandNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerBrandNameObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerBrandNameObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_BRAND_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_BRAND_NAME_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerBrandNameObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerModelNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Model Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerModelNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::ModelNumberObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerModelNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Model Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerModelNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerModelNumberObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerModelNumberObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_MODEL_NUMBER_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerModelNumberObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerCompanyNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Company Name Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCompanyNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::CompanyNameObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerCompanyNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Company Name Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCompanyNameObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerCompanyNameObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerCompanyNameObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_COMPANY_NAME_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_COMPANY_NAME_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerCompanyNameObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerCatalogNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Catalog Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCatalogNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::CatalogNumberObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerCatalogNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Catalog Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerCatalogNumberObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerCatalogNumberObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerCatalogNumberObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_CATALOG_NUMBER_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerCatalogNumberObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerLatexSafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Latex Safety Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerLatexSafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::LatexSafetyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerLatexSafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Latex Safety Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerLatexSafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerLatexSafetyObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerLatexSafetyObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_LATEX_SAFETY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerLatexSafetyObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerMRISafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer MRI Safety Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerMRISafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::MRISafetyObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerMRISafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer MRI Safety Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerMRISafetyObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerMRISafetyObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerMRISafetyObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_MRI_SAFETY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_MRI_SAFETY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerMRISafetyObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUDIOrganizerImplantableDeviceStatusObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Implantable Device Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerImplantableDeviceStatusObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::ImplantableDeviceStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUDIOrganizerImplantableDeviceStatusObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate UDI Organizer Implantable Device Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUDIOrganizerImplantableDeviceStatusObservation(UDIOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param udiOrganizer The receiving '<em><b>UDI Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateUDIOrganizerImplantableDeviceStatusObservation(UDIOrganizer udiOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "UDIOrganizerUDIOrganizerImplantableDeviceStatusObservation", "INFO");

		if (VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.UDI_ORGANIZER);
			try {
				VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				udiOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.UDI_ORGANIZER__UDI_ORGANIZER_IMPLANTABLE_DEVICE_STATUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("UDIOrganizerUDIOrganizerImplantableDeviceStatusObservation"),
						new Object[] { udiOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDeviceIdentifierObservation(UDIOrganizer) <em>Get Device Identifier Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIdentifierObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DEVICE_IDENTIFIER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::DeviceIdentifierObservation))->asSequence()->any(true).oclAsType(consol::DeviceIdentifierObservation)";

	/**
	 * The cached OCL query for the '{@link #getDeviceIdentifierObservation(UDIOrganizer) <em>Get Device Identifier Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIdentifierObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DEVICE_IDENTIFIER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeviceIdentifierObservation getDeviceIdentifierObservation(UDIOrganizer udiOrganizer) {

		if (GET_DEVICE_IDENTIFIER_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(73));
			try {
				GET_DEVICE_IDENTIFIER_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_DEVICE_IDENTIFIER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DEVICE_IDENTIFIER_OBSERVATION__EOCL_QRY);
		return (DeviceIdentifierObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLotOrBatchNumberObservation(UDIOrganizer) <em>Get Lot Or Batch Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotOrBatchNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LOT_OR_BATCH_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LotOrBatchNumberObservation))->asSequence()->any(true).oclAsType(consol::LotOrBatchNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getLotOrBatchNumberObservation(UDIOrganizer) <em>Get Lot Or Batch Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotOrBatchNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LOT_OR_BATCH_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LotOrBatchNumberObservation getLotOrBatchNumberObservation(UDIOrganizer udiOrganizer) {

		if (GET_LOT_OR_BATCH_NUMBER_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(74));
			try {
				GET_LOT_OR_BATCH_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_LOT_OR_BATCH_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_LOT_OR_BATCH_NUMBER_OBSERVATION__EOCL_QRY);
		return (LotOrBatchNumberObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSerialNumberObservation(UDIOrganizer) <em>Get Serial Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SERIAL_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SerialNumberObservation))->asSequence()->any(true).oclAsType(consol::SerialNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getSerialNumberObservation(UDIOrganizer) <em>Get Serial Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SERIAL_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SerialNumberObservation getSerialNumberObservation(UDIOrganizer udiOrganizer) {

		if (GET_SERIAL_NUMBER_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(75));
			try {
				GET_SERIAL_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SERIAL_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SERIAL_NUMBER_OBSERVATION__EOCL_QRY);
		return (SerialNumberObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getManufacturingDateObservation(UDIOrganizer) <em>Get Manufacturing Date Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingDateObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MANUFACTURING_DATE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ManufacturingDateObservation))->asSequence()->any(true).oclAsType(consol::ManufacturingDateObservation)";

	/**
	 * The cached OCL query for the '{@link #getManufacturingDateObservation(UDIOrganizer) <em>Get Manufacturing Date Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingDateObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MANUFACTURING_DATE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManufacturingDateObservation getManufacturingDateObservation(UDIOrganizer udiOrganizer) {

		if (GET_MANUFACTURING_DATE_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(76));
			try {
				GET_MANUFACTURING_DATE_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_MANUFACTURING_DATE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MANUFACTURING_DATE_OBSERVATION__EOCL_QRY);
		return (ManufacturingDateObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getExpirationDateObservation(UDIOrganizer) <em>Get Expiration Date Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDateObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXPIRATION_DATE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ExpirationDateObservation))->asSequence()->any(true).oclAsType(consol::ExpirationDateObservation)";

	/**
	 * The cached OCL query for the '{@link #getExpirationDateObservation(UDIOrganizer) <em>Get Expiration Date Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDateObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXPIRATION_DATE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpirationDateObservation getExpirationDateObservation(UDIOrganizer udiOrganizer) {

		if (GET_EXPIRATION_DATE_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(77));
			try {
				GET_EXPIRATION_DATE_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_EXPIRATION_DATE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_EXPIRATION_DATE_OBSERVATION__EOCL_QRY);
		return (ExpirationDateObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDistinctIdentificationCodeObservation(UDIOrganizer) <em>Get Distinct Identification Code Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinctIdentificationCodeObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::DistinctIdentificationCodeObservation))->asSequence()->any(true).oclAsType(consol::DistinctIdentificationCodeObservation)";

	/**
	 * The cached OCL query for the '{@link #getDistinctIdentificationCodeObservation(UDIOrganizer) <em>Get Distinct Identification Code Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinctIdentificationCodeObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DistinctIdentificationCodeObservation getDistinctIdentificationCodeObservation(
			UDIOrganizer udiOrganizer) {

		if (GET_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(78));
			try {
				GET_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISTINCT_IDENTIFICATION_CODE_OBSERVATION__EOCL_QRY);
		return (DistinctIdentificationCodeObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBrandNameObservation(UDIOrganizer) <em>Get Brand Name Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandNameObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BRAND_NAME_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::BrandNameObservation))->asSequence()->any(true).oclAsType(consol::BrandNameObservation)";

	/**
	 * The cached OCL query for the '{@link #getBrandNameObservation(UDIOrganizer) <em>Get Brand Name Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandNameObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BRAND_NAME_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrandNameObservation getBrandNameObservation(UDIOrganizer udiOrganizer) {

		if (GET_BRAND_NAME_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(79));
			try {
				GET_BRAND_NAME_OBSERVATION__EOCL_QRY = helper.createQuery(GET_BRAND_NAME_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BRAND_NAME_OBSERVATION__EOCL_QRY);
		return (BrandNameObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getModelNumberObservation(UDIOrganizer) <em>Get Model Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MODEL_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ModelNumberObservation))->asSequence()->any(true).oclAsType(consol::ModelNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getModelNumberObservation(UDIOrganizer) <em>Get Model Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MODEL_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelNumberObservation getModelNumberObservation(UDIOrganizer udiOrganizer) {

		if (GET_MODEL_NUMBER_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(80));
			try {
				GET_MODEL_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MODEL_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MODEL_NUMBER_OBSERVATION__EOCL_QRY);
		return (ModelNumberObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCompanyNameObservation(UDIOrganizer) <em>Get Company Name Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyNameObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPANY_NAME_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CompanyNameObservation))->asSequence()->any(true).oclAsType(consol::CompanyNameObservation)";

	/**
	 * The cached OCL query for the '{@link #getCompanyNameObservation(UDIOrganizer) <em>Get Company Name Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyNameObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPANY_NAME_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompanyNameObservation getCompanyNameObservation(UDIOrganizer udiOrganizer) {

		if (GET_COMPANY_NAME_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(81));
			try {
				GET_COMPANY_NAME_OBSERVATION__EOCL_QRY = helper.createQuery(GET_COMPANY_NAME_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMPANY_NAME_OBSERVATION__EOCL_QRY);
		return (CompanyNameObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCatalogNumberObservation(UDIOrganizer) <em>Get Catalog Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATALOG_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CatalogNumberObservation))->asSequence()->any(true).oclAsType(consol::CatalogNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getCatalogNumberObservation(UDIOrganizer) <em>Get Catalog Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogNumberObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATALOG_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogNumberObservation getCatalogNumberObservation(UDIOrganizer udiOrganizer) {

		if (GET_CATALOG_NUMBER_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(82));
			try {
				GET_CATALOG_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_CATALOG_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATALOG_NUMBER_OBSERVATION__EOCL_QRY);
		return (CatalogNumberObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLatexSafetyObservation(UDIOrganizer) <em>Get Latex Safety Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatexSafetyObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LATEX_SAFETY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::LatexSafetyObservation))->asSequence()->any(true).oclAsType(consol::LatexSafetyObservation)";

	/**
	 * The cached OCL query for the '{@link #getLatexSafetyObservation(UDIOrganizer) <em>Get Latex Safety Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatexSafetyObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LATEX_SAFETY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LatexSafetyObservation getLatexSafetyObservation(UDIOrganizer udiOrganizer) {

		if (GET_LATEX_SAFETY_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(83));
			try {
				GET_LATEX_SAFETY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_LATEX_SAFETY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_LATEX_SAFETY_OBSERVATION__EOCL_QRY);
		return (LatexSafetyObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMRISafetyObservation(UDIOrganizer) <em>Get MRI Safety Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRISafetyObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MRI_SAFETY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MRISafetyObservation))->asSequence()->any(true).oclAsType(consol::MRISafetyObservation)";

	/**
	 * The cached OCL query for the '{@link #getMRISafetyObservation(UDIOrganizer) <em>Get MRI Safety Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRISafetyObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MRI_SAFETY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MRISafetyObservation getMRISafetyObservation(UDIOrganizer udiOrganizer) {

		if (GET_MRI_SAFETY_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(84));
			try {
				GET_MRI_SAFETY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MRI_SAFETY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MRI_SAFETY_OBSERVATION__EOCL_QRY);
		return (MRISafetyObservation) query.evaluate(udiOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImplantableDeviceStatusObservation(UDIOrganizer) <em>Get Implantable Device Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplantableDeviceStatusObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ImplantableDeviceStatusObservation))->asSequence()->any(true).oclAsType(consol::ImplantableDeviceStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getImplantableDeviceStatusObservation(UDIOrganizer) <em>Get Implantable Device Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplantableDeviceStatusObservation(UDIOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplantableDeviceStatusObservation getImplantableDeviceStatusObservation(UDIOrganizer udiOrganizer) {

		if (GET_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.UDI_ORGANIZER, ConsolPackage.Literals.UDI_ORGANIZER.getEAllOperations().get(85));
			try {
				GET_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_IMPLANTABLE_DEVICE_STATUS_OBSERVATION__EOCL_QRY);
		return (ImplantableDeviceStatusObservation) query.evaluate(udiOrganizer);
	}

} // UDIOrganizerOperations
