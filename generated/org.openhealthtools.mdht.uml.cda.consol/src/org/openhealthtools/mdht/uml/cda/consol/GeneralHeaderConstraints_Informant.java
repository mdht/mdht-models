/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Informant12;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Header Constraints Informant</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getGeneralHeaderConstraints_Informant()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='InformantHasAssignedEntityOrRelatedEntity'"
 * @generated
 */
public interface GeneralHeaderConstraints_Informant extends Informant12 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateInformantHasAssignedEntityOrRelatedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints_Informant init();
} // GeneralHeaderConstraints_Informant
