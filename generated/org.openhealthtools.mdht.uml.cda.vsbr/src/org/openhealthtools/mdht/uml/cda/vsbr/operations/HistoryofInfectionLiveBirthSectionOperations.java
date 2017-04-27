/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Historyof Infection Live Birth Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Infection Present Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#getInfectionPresentLiveBirths() <em>Get Infection Present Live Births</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryofInfectionLiveBirthSectionOperations
		extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
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
	protected HistoryofInfectionLiveBirthSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryofInfectionLiveBirthSectionTemplateId(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionTemplateId(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryofInfectionLiveBirthSectionTemplateId(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionTemplateId(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyofInfectionLiveBirthSection The receiving '<em><b>Historyof Infection Live Birth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryofInfectionLiveBirthSectionTemplateId(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION);
			try {
				VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				historyofInfectionLiveBirthSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HistoryofInfectionLiveBirthSectionHistoryofInfectionLiveBirthSectionTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										historyofInfectionLiveBirthSection, context) }),
						new Object[] { historyofInfectionLiveBirthSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryofInfectionLiveBirthSectionCode(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionCode(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '71459-2' and value.codeSystemName = 'LOINC')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryofInfectionLiveBirthSectionCode(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionCode(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyofInfectionLiveBirthSection The receiving '<em><b>Historyof Infection Live Birth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryofInfectionLiveBirthSectionCode(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION);
			try {
				VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				historyofInfectionLiveBirthSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HistoryofInfectionLiveBirthSectionHistoryofInfectionLiveBirthSectionCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										historyofInfectionLiveBirthSection, context) }),
						new Object[] { historyofInfectionLiveBirthSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryofInfectionLiveBirthSectionText(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionText(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryofInfectionLiveBirthSectionText(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionText(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyofInfectionLiveBirthSection The receiving '<em><b>Historyof Infection Live Birth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryofInfectionLiveBirthSectionText(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION);
			try {
				VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				historyofInfectionLiveBirthSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HistoryofInfectionLiveBirthSectionHistoryofInfectionLiveBirthSectionText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										historyofInfectionLiveBirthSection, context) }),
						new Object[] { historyofInfectionLiveBirthSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Infection Present Live Birth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfectionPresentLiveBirth))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Infection Present Live Birth</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(HistoryofInfectionLiveBirthSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyofInfectionLiveBirthSection The receiving '<em><b>Historyof Infection Live Birth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION);
			try {
				VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				historyofInfectionLiveBirthSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION__HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HistoryofInfectionLiveBirthSectionHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										historyofInfectionLiveBirthSection, context) }),
						new Object[] { historyofInfectionLiveBirthSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfectionPresentLiveBirths(HistoryofInfectionLiveBirthSection) <em>Get Infection Present Live Births</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectionPresentLiveBirths(HistoryofInfectionLiveBirthSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFECTION_PRESENT_LIVE_BIRTHS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfectionPresentLiveBirth)).oclAsType(vsbr::InfectionPresentLiveBirth)";

	/**
	 * The cached OCL query for the '{@link #getInfectionPresentLiveBirths(HistoryofInfectionLiveBirthSection) <em>Get Infection Present Live Births</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfectionPresentLiveBirths(HistoryofInfectionLiveBirthSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFECTION_PRESENT_LIVE_BIRTHS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<InfectionPresentLiveBirth> getInfectionPresentLiveBirths(
			HistoryofInfectionLiveBirthSection historyofInfectionLiveBirthSection) {

		if (GET_INFECTION_PRESENT_LIVE_BIRTHS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION,
				VsbrPackage.Literals.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION.getEAllOperations().get(59));
			try {
				GET_INFECTION_PRESENT_LIVE_BIRTHS__EOCL_QRY = helper.createQuery(
					GET_INFECTION_PRESENT_LIVE_BIRTHS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INFECTION_PRESENT_LIVE_BIRTHS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InfectionPresentLiveBirth> result = (Collection<InfectionPresentLiveBirth>) query.evaluate(
			historyofInfectionLiveBirthSection);
		return new BasicEList.UnmodifiableEList<InfectionPresentLiveBirth>(result.size(), result.toArray());
	}

} // HistoryofInfectionLiveBirthSectionOperations
