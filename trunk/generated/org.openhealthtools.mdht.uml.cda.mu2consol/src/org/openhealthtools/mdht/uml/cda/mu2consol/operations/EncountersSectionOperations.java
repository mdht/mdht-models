/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounters Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection#validateMu2consolEncountersSectionEncounterActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Encounters Section Encounter Activities</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.EncountersSection#getmu2consolEncounterActivitiess()
 * <em>Getmu2consol Encounter Activitiess</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EncountersSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.EncountersSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EncountersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateMu2consolEncountersSectionEncounterActivities(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Mu2consol Encounters Section Encounter Activities</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateMu2consolEncountersSectionEncounterActivities(EncountersSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncounterActivities))";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateMu2consolEncountersSectionEncounterActivities(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Mu2consol Encounters Section Encounter Activities</em>}'
	 * invariant operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateMu2consolEncountersSectionEncounterActivities(EncountersSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not
	 * entry.encounter.oclIsUndefined() and
	 * entry.encounter.oclIsKindOf(consol::EncounterActivities))
	 * 
	 * @param encountersSection
	 *            The receiving '<em><b>Encounters Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolEncountersSectionEncounterActivities(
			EncountersSection encountersSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV
				.createQuery(
						VALIDATE_MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(encountersSection)) {
			if (diagnostics != null) {
				diagnostics
						.add(new BasicDiagnostic(
								Diagnostic.ERROR,
								Mu2consolValidator.DIAGNOSTIC_SOURCE,
								Mu2consolValidator.ENCOUNTERS_SECTION__MU2CONSOL_ENCOUNTERS_SECTION_ENCOUNTER_ACTIVITIES,
								org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
										.getString(
												"_UI_GenericInvariant_diagnostic",
												new Object[] {
														"Mu2consolEncountersSectionEncounterActivities",
														org.eclipse.emf.ecore.util.EObjectValidator
																.getObjectLabel(
																		encountersSection,
																		context) }),
								new Object[] { encountersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getmu2consolEncounterActivitiess(EncountersSection)
	 * <em>Getmu2consol Encounter Activitiess</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolEncounterActivitiess(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMU2CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncounterActivities)).oclAsType(consol::EncounterActivities)";

	/**
	 * The cached OCL query for the '
	 * {@link #getmu2consolEncounterActivitiess(EncountersSection)
	 * <em>Getmu2consol Encounter Activitiess</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getmu2consolEncounterActivitiess(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMU2CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not
	 * encounter.oclIsUndefined() and
	 * encounter.oclIsKindOf(consol::EncounterActivities
	 * )).oclAsType(consol::EncounterActivities)
	 * 
	 * @param encountersSection
	 *            The receiving '<em><b>Encounters Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<EncounterActivities> getmu2consolEncounterActivitiess(
			EncountersSection encountersSection) {
		if (GETMU2CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
					Mu2consolPackage.Literals.ENCOUNTERS_SECTION,
					Mu2consolPackage.Literals.ENCOUNTERS_SECTION
							.getEAllOperations().get(66));
			try {
				GETMU2CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY = helper
						.createQuery(GETMU2CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(
						pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV
				.createQuery(GETMU2CONSOL_ENCOUNTER_ACTIVITIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncounterActivities> result = (Collection<EncounterActivities>) query
				.evaluate(encountersSection);
		return new BasicEList.UnmodifiableEList<EncounterActivities>(
				result.size(), result.toArray());
	}

} // EncountersSectionOperations