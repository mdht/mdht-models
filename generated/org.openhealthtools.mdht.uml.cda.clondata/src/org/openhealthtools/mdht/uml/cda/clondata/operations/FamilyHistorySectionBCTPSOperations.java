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
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family Historyof Cancer None</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family History Pedigree</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family History Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#getFamilyHistoryofCancerNone() <em>Get Family Historyof Cancer None</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#getFamilyHistoryPedigree() <em>Get Family History Pedigree</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#getFamilyHistoryOrganizer() <em>Get Family History Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySectionBCTPSOperations extends FamilyHistorySectionOperations {
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
	protected FamilyHistorySectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family Historyof Cancer None</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(clondata::FamilyHistoryofCancerNone))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family Historyof Cancer None</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySectionBCTPS The receiving '<em><b>Family History Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS());
			try {
				VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistorySectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistorySectionBCTPSFamilyHistorySectionBCTPSFamilyHistoryofCancerNone",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistorySectionBCTPS, context) }),
						new Object[] { familyHistorySectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family History Pedigree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(clondata::FamilyHistoryPedigree))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family History Pedigree</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySectionBCTPS The receiving '<em><b>Family History Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS());
			try {
				VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistorySectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistorySectionBCTPSFamilyHistorySectionBCTPSFamilyHistoryPedigree",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistorySectionBCTPS, context) }),
						new Object[] { familyHistorySectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family History Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FamilyHistoryOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section BCTPS Family History Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySectionBCTPS The receiving '<em><b>Family History Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS());
			try {
				VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistorySectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistorySectionBCTPSFamilyHistorySectionBCTPSFamilyHistoryOrganizer",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistorySectionBCTPS, context) }),
						new Object[] { familyHistorySectionBCTPS }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS) <em>Get Family Historyof Cancer None</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORYOF_CANCER_NONE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::FamilyHistoryofCancerNone))->asSequence()->any(true).oclAsType(clondata::FamilyHistoryofCancerNone)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS) <em>Get Family Historyof Cancer None</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryofCancerNone(FamilyHistorySectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORYOF_CANCER_NONE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistoryofCancerNone getFamilyHistoryofCancerNone(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS) {

		if (GET_FAMILY_HISTORYOF_CANCER_NONE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS().getEAllOperations().get(65));
			try {
				GET_FAMILY_HISTORYOF_CANCER_NONE__EOCL_QRY = helper.createQuery(
					GET_FAMILY_HISTORYOF_CANCER_NONE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORYOF_CANCER_NONE__EOCL_QRY);
		return (FamilyHistoryofCancerNone) query.evaluate(familyHistorySectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryPedigree(FamilyHistorySectionBCTPS) <em>Get Family History Pedigree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryPedigree(FamilyHistorySectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_PEDIGREE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(clondata::FamilyHistoryPedigree))->asSequence()->any(true).oclAsType(clondata::FamilyHistoryPedigree)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryPedigree(FamilyHistorySectionBCTPS) <em>Get Family History Pedigree</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryPedigree(FamilyHistorySectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_PEDIGREE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistoryPedigree getFamilyHistoryPedigree(FamilyHistorySectionBCTPS familyHistorySectionBCTPS) {

		if (GET_FAMILY_HISTORY_PEDIGREE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS().getEAllOperations().get(66));
			try {
				GET_FAMILY_HISTORY_PEDIGREE__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_PEDIGREE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_PEDIGREE__EOCL_QRY);
		return (FamilyHistoryPedigree) query.evaluate(familyHistorySectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistoryOrganizer(FamilyHistorySectionBCTPS) <em>Get Family History Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryOrganizer(FamilyHistorySectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FamilyHistoryOrganizer))->asSequence()->any(true).oclAsType(consol::FamilyHistoryOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistoryOrganizer(FamilyHistorySectionBCTPS) <em>Get Family History Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistoryOrganizer(FamilyHistorySectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistoryOrganizer getFamilyHistoryOrganizer(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS) {

		if (GET_FAMILY_HISTORY_ORGANIZER__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS().getEAllOperations().get(67));
			try {
				GET_FAMILY_HISTORY_ORGANIZER__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_ORGANIZER__EOCL_QRY);
		return (FamilyHistoryOrganizer) query.evaluate(familyHistorySectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistorySectionTemplateId(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionTemplateId(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistorySectionTemplateId(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistorySectionTemplateId(FamilyHistorySectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param familyHistorySectionBCTPS The receiving '<em><b>Family History Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFamilyHistorySectionTemplateId(FamilyHistorySectionBCTPS familyHistorySectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getFamilyHistorySectionBCTPS());
			try {
				VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				familyHistorySectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FamilyHistorySectionBCTPSFamilyHistorySectionTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										familyHistorySectionBCTPS, context) }),
						new Object[] { familyHistorySectionBCTPS }));
			}

			return false;
		}
		return true;
	}

} // FamilyHistorySectionBCTPSOperations
