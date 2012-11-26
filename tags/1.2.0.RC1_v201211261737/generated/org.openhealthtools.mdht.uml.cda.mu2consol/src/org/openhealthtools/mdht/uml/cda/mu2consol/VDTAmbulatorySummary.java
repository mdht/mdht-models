/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>VDT Ambulatory Summary</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getVDTAmbulatorySummary()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.query='VDTAmbulatorySummaryResponsibleParty' constraints.validation.error='VDTAmbulatorySummaryResponsibleParty'"
 * @generated
 */
public interface VDTAmbulatorySummary extends ViewDownloadTransmitSummary {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self
	 * .componentOf->excluding(null).encompassingEncounter->excluding(null)->
	 * reject(responsibleParty->one(responsibleParty :
	 * 
	 * cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and
	 * responsibleParty.oclIsKindOf(rim::Participation)))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : \r\r\ncda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(rim::Participation)))'"
	 * @generated
	 */
	boolean validateVDTAmbulatorySummaryResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public VDTAmbulatorySummary init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public VDTAmbulatorySummary init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // VDTAmbulatorySummary
