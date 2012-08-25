/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Allergies Section Entries Optional</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getAllergiesSectionEntriesOptional()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='mu2consolAllergiesSectionEntriesOptionalAllergyProblemAct'"
 * @generated
 */
public interface AllergiesSectionEntriesOptional extends
		org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::AllergyProblemAct))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::AllergyProblemAct))'"
	 * @generated
	 */
	boolean validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::AllergyProblemAct))->asSequence()->any(true).oclAsType
	 * (consol::AllergyProblemAct) <!-- end-model-doc -->
	 * 
	 * @model required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::AllergyProblemAct))->asSequence()->any(true).oclAsType(consol::AllergyProblemAct)'"
	 * @generated
	 */
	AllergyProblemAct getmu2consolAllergyProblemAct();

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public AllergiesSectionEntriesOptional init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public AllergiesSectionEntriesOptional init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergiesSectionEntriesOptional
