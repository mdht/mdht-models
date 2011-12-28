/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEncounterActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounter Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#getConsolEncounterActivitiess() <em>Get Consol Encounter Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersSectionOperations extends EncountersSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEncounterActivities(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounter Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEncounterActivities(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivities))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEncounterActivities(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounter Activities</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEncounterActivities(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivities))
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionEncounterActivities(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES,
					ConsolPlugin.INSTANCE.getString("EncountersSectionEncounterActivities"),
					new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolEncounterActivitiess(EncountersSection) <em>Get Consol Encounter Activitiess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterActivitiess(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivities)).oclAsType(consol::EncounterActivities)";

	/**
	 * The cached OCL query for the '{@link #getConsolEncounterActivitiess(EncountersSection) <em>Get Consol Encounter Activitiess</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolEncounterActivitiess(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivities)).oclAsType(consol::EncounterActivities)
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<EncounterActivities> getConsolEncounterActivitiess(EncountersSection encountersSection) {
		if (GET_CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTERS_SECTION,
				ConsolPackage.Literals.ENCOUNTERS_SECTION.getEAllOperations().get(62));
			try {
				GET_CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY = helper.createQuery(GET_CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterActivities> result = (Collection<EncounterActivities>) query.evaluate(encountersSection);
		return new BasicEList.UnmodifiableEList<EncounterActivities>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.22.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.22.1')
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionEntriesOptionalTemplateId(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EncountersSectionEntriesOptionalTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(encountersSection, context) }),
					new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

} // EncountersSectionOperations
