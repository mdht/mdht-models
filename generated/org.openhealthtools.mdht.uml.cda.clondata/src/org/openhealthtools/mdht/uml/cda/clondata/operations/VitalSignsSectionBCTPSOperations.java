/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsSectionEntriesOptionalOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS#validateVitalSignsSectionBCTPSTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section BCTPS Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS#validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section BCTPS Vital Signs Organizer BCTPS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS#getVitalSignsOrganizerBCTPS() <em>Get Vital Signs Organizer BCTPS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionBCTPSOperations extends VitalSignsSectionEntriesOptionalOperations {
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
	protected VitalSignsSectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionBCTPSTemplateId(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section BCTPS Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionBCTPSTemplateId(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionBCTPSTemplateId(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section BCTPS Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionBCTPSTemplateId(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSectionBCTPS The receiving '<em><b>Vital Signs Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsSectionBCTPSTemplateId(VitalSignsSectionBCTPS vitalSignsSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getVitalSignsSectionBCTPS());
			try {
				VALIDATE_VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.VITAL_SIGNS_SECTION_BCTPS__VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"VitalSignsSectionBCTPSVitalSignsSectionBCTPSTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										vitalSignsSectionBCTPS, context) }),
						new Object[] { vitalSignsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section BCTPS Vital Signs Organizer BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(clondata::VitalSignsOrganizerBCTPS))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section BCTPS Vital Signs Organizer BCTPS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSectionBCTPS The receiving '<em><b>Vital Signs Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(
			VitalSignsSectionBCTPS vitalSignsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getVitalSignsSectionBCTPS());
			try {
				VALIDATE_VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.VITAL_SIGNS_SECTION_BCTPS__VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"VitalSignsSectionBCTPSVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										vitalSignsSectionBCTPS, context) }),
						new Object[] { vitalSignsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS) <em>Get Vital Signs Organizer BCTPS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_ORGANIZER_BCTPS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(clondata::VitalSignsOrganizerBCTPS))->asSequence()->any(true).oclAsType(clondata::VitalSignsOrganizerBCTPS)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS) <em>Get Vital Signs Organizer BCTPS</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_ORGANIZER_BCTPS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsOrganizerBCTPS getVitalSignsOrganizerBCTPS(VitalSignsSectionBCTPS vitalSignsSectionBCTPS) {

		if (GET_VITAL_SIGNS_ORGANIZER_BCTPS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getVitalSignsSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getVitalSignsSectionBCTPS().getEAllOperations().get(64));
			try {
				GET_VITAL_SIGNS_ORGANIZER_BCTPS__EOCL_QRY = helper.createQuery(
					GET_VITAL_SIGNS_ORGANIZER_BCTPS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_ORGANIZER_BCTPS__EOCL_QRY);
		return (VitalSignsOrganizerBCTPS) query.evaluate(vitalSignsSectionBCTPS);
	}

} // VitalSignsSectionBCTPSOperations
