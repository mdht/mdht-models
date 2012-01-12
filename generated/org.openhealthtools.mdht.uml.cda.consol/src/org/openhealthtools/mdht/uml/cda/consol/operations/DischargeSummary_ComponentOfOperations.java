/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary_ComponentOf;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Component1Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary Component Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary_ComponentOf#validateComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummary_ComponentOfOperations extends Component1Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummary_ComponentOfOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComponentOfEncompassingEncounter(DischargeSummary_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComponentOfEncompassingEncounter(DischargeSummary_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter))";

	/**
	 * The cached OCL invariant for the '{@link #validateComponentOfEncompassingEncounter(DischargeSummary_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComponentOfEncompassingEncounter(DischargeSummary_ComponentOf, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter))
	 * @param dischargeSummary_ComponentOf The receiving '<em><b>Discharge Summary Component Of</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateComponentOfEncompassingEncounter(
			DischargeSummary_ComponentOf dischargeSummary_ComponentOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY_COMPONENT_OF);
			try {
				VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary_ComponentOf)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY_COMPONENT_OF__COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
					ConsolPlugin.INSTANCE.getString("ComponentOfEncompassingEncounter"),
					new Object[] { dischargeSummary_ComponentOf }));
			}
			return false;
		}
		return true;
	}

} // DischargeSummary_ComponentOfOperations
